package daliborn.info.pitanje;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.staticFileLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;
import daliborn.info.pitanje.domain.Question;
import daliborn.info.pitanje.service.JsonTransformer;
import daliborn.info.pitanje.service.QuestionService;
import daliborn.info.pitanje.service.QuestionServiceImpl;

public class Pitanja {


	public static void main(String[] args) {
		QuestionService questService = new QuestionServiceImpl ();
		JsonTransformer jsonTransformer = new JsonTransformer();		
		Map<String,List<Question>> map = new HashMap<>();
        
        staticFileLocation("/public");
        
        get("/", (rq, rs) -> {
    		List<Question> questions = questService.allQuestions();
    		
    		map.put("questions", questions);

        	return new ModelAndView(map, "hello.html");
        }, new MustacheTemplateEngine());
        
        post("/pitanje", (request, response) -> {

                String questionArg = request.queryParams("question");

                Question question = new Question(questionArg);
                questService.create(question);
                
        		List<Question> questions = questService.allQuestions();
        		
        		map.put("questions", questions);
                response.status(201); 
				return new ModelAndView(map, "hello.html");
        }, new MustacheTemplateEngine());


        get("/pitanje/all", "application/json", (request, response) -> {
    		List<Question> questions = questService.allQuestions();
        	map.clear();
			map.put("questions", questions);
            return map;
        }, jsonTransformer);

    }

}
