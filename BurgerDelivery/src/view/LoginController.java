package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;
import service.CommonService;
import service.CommonServiceImpl;
import service.LoginService;
import service.LoginServiceImpl;
import service.MembershipService;
import service.MembershipServiceImpl;

public class LoginController extends Controller implements Initializable {
	private Parent root;
	private LoginService loginSrv;
	private CommonService comSrv;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loginSrv = new LoginServiceImpl();
		comSrv = new CommonServiceImpl();
		
	}

	public void cancelProc(ActionEvent event) {
		comSrv.WindowClose(event);
	}
	
	public void loginProc(ActionEvent event) {
		loginSrv.LoginProc(root);
	}
	
	public void joinProc(ActionEvent event) {
		loginSrv.OpenJoinForm();
	}
	
	
	@Override
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}

}
