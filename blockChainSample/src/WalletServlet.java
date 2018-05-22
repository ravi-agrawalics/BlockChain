
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WalletServlet
 */
public class WalletServlet extends HttpServlet {
       


	//initBalance
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String initBalanceA=request.getParameter("initBalanceA");  
		System.out.println("Recharged Successfully with myCoin for walletA"+initBalanceA);
		
		String initBalanceB=request.getParameter("initBalanceB");  
		System.out.println("Recharged Successfully with myCoin for walletB"+initBalanceB);
		
		
	}

}
