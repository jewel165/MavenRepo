package AmazonLocator;

public class Locators {
	

	public String azlogo = "//*[@id=\"nav-logo\"]";
	//SIgn-in/Sign-out/Account related
	public String Account= "//*[@id=\"nav-signin-tooltip\"]/a/span";
	public String Log_email ="//*[@id=\"ap_email\"]";
	public String Log_cont = "//*[@id=\"continue\"]";
	public String Log_Pass = "//*[@id='ap_password']";
	public String signin = "//*[@id=\'signInSubmit\']";
	public String crtacc= "//*[@id=\'createAccountSubmit\']";
	public String AccHolder = "//*[@id=\"nav-link-accountList\"]/span[1]";
	
	//Search Related
	public String srcbar = "//*[@id=\'twotabsearchtextbox\']";
	public String scr = ".nav-search-submit > input:nth-child(2)";
	public String searchbutton ="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input";
	public String srcressult ="/html/body/div[1]/div[1]/span[2]/h1/div/div[1]/div/div/span[3]";
	public String SrcList = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span";
	public String AddC = "add-to-cart-button";
	public String AddExt = "attachSiNoCoverage-announce";
	public String AddConf = "//*[@id=\"attachDisplayAddBaseAlert\"]/div/h4";

}
