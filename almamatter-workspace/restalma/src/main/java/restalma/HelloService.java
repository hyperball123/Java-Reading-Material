package restalma;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

//http://localhost:3030/restalma/rest/helloservice/hello
@Path("/helloservice")
public class HelloService {
	
	@GET
	@Path("/hello")
	public void sayHello() {
		System.out.println("Welcome To REST.....");
	}
//PATHPARAM, QUERYPARAM, MATRIXPARAM, FORMPARAM
		
	//http://localhost:2020/restalma/rest/helloservice/say2/almamatter
	@GET
	@Path("/say2/{uname}")
	public void sayHello2(@PathParam("uname") String name) {
		System.out.println("Name...:"+name);
	}
	
	//http://localhost:2020/restalma/rest/helloservice/say2/almamatter/inspiron
	@GET
	@Path("/say2/{uname}/{upass}")
	public Response sayHello22(@PathParam("uname") String name,@PathParam("upass") String upass) {
		System.out.println("Name...:"+name+":"+upass);
		return Response.status(200).entity("Name...:"+name+":"+upass).build();		
	} 
	
	//http://localhost:2020/restalma/rest/helloservice/say3?uname=almamatter&upass=inspiron
	@GET
	@Path("/say3")
	public Response sayHello3(@QueryParam("uname") String name,@QueryParam("upass") String pass) {
		System.out.println("Name...:"+name+":"+pass);
		return Response.status(200).entity("Name...:"+name+":"+pass).build();
		
	}
	
	//http://localhost:2020/restalma/rest/helloservice/say33?names=almamatter&names=inspiron&names=curie
	@GET
	@Path("/say33")
	public void sayHello33(@QueryParam("names") List<String> names) {
		for(String s:names) {
			System.out.println(s);
		}
	}
	
	@POST
	@Path("/say4")
	public Response sayHello4(@FormParam("uname") String name,@FormParam("upass") String pass) {
		System.out.println("Name...:"+name+":"+pass);
		return Response.status(200).entity("Name...:"+name+":"+pass).build();
	}
	
	@GET
	@Path("/say5")
	public Response sayHello5(@Context ServletContext ctx,@Context HttpServletRequest request) {
		
		String path=ctx.getRealPath("/WEB-INF/config.properties");
		HttpSession session=request.getSession();
		session.setAttribute("path", path);
		return Response.status(200).entity(session.getAttribute("path")).build();		
	}
	
}
