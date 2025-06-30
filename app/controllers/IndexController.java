package controllers;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;

public class IndexController extends Controller
{
	private final Logger.ALogger logger = Logger.of(IndexController.class);

	public Result get(String input)
	{
		// logger.trace("Trace logging");
		// logger.debug("Debug logging");
		// logger.info("Info logging");
		// logger.warn("Warn logging");
		logger.error("Error logging");

		return ok("GET REQUEST with input: " + input);
	}

	public Result post(Http.Request request)
	{
		return ok("POST REQUEST with payload: " + request.body().asJson().toString());
	}

	public Result put(Http.Request request)
	{
		return ok("PUT REQUEST with payload: " + request.body().asJson().toString());
	}

	public Result delete()
	{
		return ok("DELETE REQUEST");
	}
}