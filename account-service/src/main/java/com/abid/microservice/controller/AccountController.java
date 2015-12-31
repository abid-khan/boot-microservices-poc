package com.abid.microservice.controller;

import com.abid.microservice.model.Account;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abidk on 12/24/15.
 */
@Component @Path("/accounts") public class AccountController {

	@GET @Consumes(MediaType.APPLICATION_FORM_URLENCODED) @Produces(MediaType.APPLICATION_JSON) public Response finaAllAccounts(
			@Context HttpServletRequest request) {

		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("micro"));
		return Response.ok().entity(accounts).build();
	}
}
