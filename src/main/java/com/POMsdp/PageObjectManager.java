package com.POMsdp;

import org.openqa.selenium.WebDriver;

import com.POMClass.AddtoCart;
import com.POMClass.CheckOut;
import com.POMClass.ColorPick;
import com.POMClass.Confirm;
import com.POMClass.Dresses;
import com.POMClass.HomePage;
import com.POMClass.Message;
import com.POMClass.MyAccount;
import com.POMClass.OrderConfirmation;
import com.POMClass.Payment;
import com.POMClass.Shipping;
import com.POMClass.SigninPage;
import com.POMClass.Summary;

public class PageObjectManager {

	public static WebDriver driver;

	private HomePage hp;
	private SigninPage sp;
	private MyAccount ma;
	private Dresses d;
	private ColorPick cp;
	private AddtoCart ac;
	private CheckOut co;
	private Summary su;
	private Message m;
	private Shipping sg;
	private Payment p;
	private OrderConfirmation oc;
	private Confirm c;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public HomePage getInstanceHp() {
		if (hp == null) {

			hp = new HomePage(driver);

		}

		return hp;
	}

	public SigninPage getInstanceSp() {

		if (sp == null) {

			sp = new SigninPage(driver);

		}
		return sp;
	}

	public MyAccount getInstanceMa() {

		if (ma == null) {

			ma = new MyAccount(driver);

		}
		return ma;
	}

	public Dresses getInstanceD() {

		if (d == null) {

			d = new Dresses(driver);

		}
		return d;
	}

	public ColorPick getInstanceCp() {

		if (cp == null) {

			cp = new ColorPick(driver);

		}
		return cp;
	}

	public AddtoCart getInstanceAc() {

		if (ac == null) {

			ac = new AddtoCart(driver);
		}

		return ac;
	}

	public CheckOut getInstanceCo() {

		if (co == null) {
			co = new CheckOut(driver);
		}
		return co;
	}

	public Summary getInstanceSu() {

		if (su == null) {
			su = new Summary(driver);

		}
		return su;
	}

	public Message getInstanceM() {

		if (m == null) {
			m = new Message(driver);

		}
		return m;
	}

	public Shipping getInstanceSg() {

		if (sg == null) {
			sg = new Shipping(driver);
		}
		return sg;
	}

	public Payment getInstanceP() {

		if (p == null) {
			p = new Payment(driver);
		}
		return p;
	}

	public OrderConfirmation getInstanceOc() {

		if (oc == null) {
			oc = new OrderConfirmation(driver);
		}
		return oc;
	}

	public Confirm getInstanceC() {

		if (c == null) {

			c = new Confirm(driver);
		}
		return c;
	}

}
