

/**
 * @author faculty
 * 7 May 2021
 */
/**
 * @author Cherise Mudge 
 * 		12/05/2021
 */
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Main {

	/**
	 * @param args
	 * @param SWT.jar 
	 * 		Third party program in use 
	 * 		https://www.eclipse.org/swt/
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new RowLayout());
		//add widget 
		//create a General Information Group
		Group generalInfo = new Group (shell, SWT.SHADOW_IN);
		generalInfo.setText("General Information");
		generalInfo.setLayout(new RowLayout(SWT.VERTICAL));
		/*create label 1 "Please Enter Name"
			create Text Field tf1*/ 
		Label l1 = new Label (generalInfo, SWT.NONE);
				l1.setText("Please Enter Name");
		Text tf1 = new Text (generalInfo, SWT.BORDER);
		/*create label 2 " Please Enter Date"
		create Text Field tf2*/
		Label l2 = new Label (generalInfo, SWT.NONE);
				l2.setText("Please Enter Date");
		Text tf2 = new Text (generalInfo, SWT.BORDER);
		/*create button group 
			create radio Buttons "male" and "Feamle"
			add the radio buttons to button group*/ 
		Group genderGroup = new Group (generalInfo, SWT.SHADOW_IN);
		genderGroup.setText("You Are?");
		genderGroup.setLayout(new RowLayout(SWT.VERTICAL));
		Button ggr1 = new Button(genderGroup, SWT.RADIO);
			ggr1.setText("Male");
		Button ggr2 = new Button(genderGroup, SWT.RADIO);
			ggr2.setText("Female");
		Button ggr3 = new Button(genderGroup, SWT.RADIO);
			ggr3.setText("Other");
		/*create label 3 "Please Enter Age"
			create Text Field tf3*/
		Label l3 = new Label (generalInfo, SWT.NONE);
			l3.setText("Please Enter Age");
		Text tf3 = new Text(generalInfo, SWT.BORDER);
		//create label 4 "It's Question Time"
		Group iqt = new Group(shell, SWT.NO_RADIO_GROUP);
		iqt.setText("It's Question Time");
		iqt.setLayout(new RowLayout(SWT.VERTICAL));
		/*create expand bar 1 "What fruit do you like"
			add check box buttons with "Apple, Pineapple,Dragonfruit, Orange, Strawberries, Mandarines,Banana*/
		Group questionOne = new Group (iqt, SWT.NO_RADIO_GROUP);
		questionOne.setText("What Fruit Do You Like?");
		questionOne.setLayout(new RowLayout(SWT.VERTICAL));
	    Button qo1 = new Button(questionOne, SWT.CHECK);
	    	qo1.setText("Apple");
	    Button qo2 = new Button(questionOne, SWT.CHECK);
	    	qo2.setText("Pineapple");
	    Button qo3 = new Button(questionOne, SWT.CHECK);
	    	qo3.setText("Dragonfruit");
	    Button qo4 = new Button(questionOne, SWT.CHECK);
	    	qo4.setText("Orange");
	    Button qo5 = new Button(questionOne, SWT.CHECK);
	    	qo5.setText("Strawberries");
	    Button qo6 = new Button(questionOne, SWT.CHECK);
	    	qo6.setText("Mandarines");
	    Button qo7 = new Button(questionOne, SWT.CHECK);
	    	qo7.setText("Banana");

		/*create Question 2 group "favorite animal"
			add radio buttons with "Wolf, Tiger,Lion,Deer,Rabit,Dolpine,Bear,Egal"*/
	    Group questionTwo = new Group (shell, SWT.SHADOW_IN);
		questionTwo.setText("What's Your Favorite Animal?");
		questionTwo.setLayout(new RowLayout(SWT.VERTICAL));
	    Button qt1 = new Button(questionTwo, SWT.RADIO);
	    	qt1.setText("Wolf");
	    Button qt2 = new Button(questionTwo, SWT.RADIO);
	    	qt2.setText("Tiger");
	    Button qt3 = new Button(questionTwo, SWT.RADIO);
	    	qt3.setText("Lion");
	    Button qt4 = new Button(questionTwo, SWT.RADIO);
	    	qt4.setText("Deer");
	    Button qt5 = new Button(questionTwo, SWT.RADIO);
	    	qt5.setText("Rabbit");
	    Button qt6 = new Button(questionTwo, SWT.RADIO);
	    	qt6.setText("Dolphin");
	    Button qt7 = new Button(questionTwo, SWT.RADIO);
	    	qt7.setText("Bear");
	    Button qt8 = new Button(questionTwo, SWT.RADIO);
	    	qt8.setText("Eagle");
		/*create Question 3 group "favorite colours"
			add check boxs with colours "Red, Black, White, Purple, Yellow, Green, Orange, Brown, Blue, Pink"*/
		Group questionThree = new Group (shell, SWT.SHADOW_IN);
		questionThree.setText("What's Your Favourite Colour?");
		questionThree.setLayout(new RowLayout(SWT.VERTICAL));
		Button qth1 = new Button(questionThree, SWT.RADIO);
			qth1.setText("Red");
		Button qth2 = new Button(questionThree, SWT.RADIO);
			qth2.setText("Black");
		Button qth3 = new Button(questionThree, SWT.RADIO);
			qth3.setText("White");
		Button qth4 = new Button(questionThree, SWT.RADIO);
			qth4.setText("Purple");
		Button qth5 = new Button(questionThree, SWT.RADIO);
			qth5.setText("Yellow");
		Button qth6 = new Button(questionThree, SWT.RADIO);
			qth6.setText("Green");
		Button qth7 = new Button(questionThree, SWT.RADIO);
			qth7.setText("Orange");
		Button qth8 = new Button(questionThree, SWT.RADIO);
			qth8.setText("Brown");
		Button qth9 = new Button(questionThree, SWT.RADIO);
			qth9.setText("Blue");
		Button qth10 = new Button(questionThree, SWT.RADIO);
			qth10.setText("Pink");
	    /*create expand bar 5 "What flowers do you like"
		 	* add check box with "Roses, Dasiy, Iris, Franigipani, Tiger Lilly, Lotus," */
		Group questionFour = new Group (shell, SWT.NO_RADIO_GROUP);
		questionFour.setText("What Flowers Do You Like");
		questionFour.setLayout(new RowLayout(SWT.VERTICAL));
		Button qf1 = new Button(questionFour, SWT.CHECK);
			qf1.setText("Roses");
		Button qf2 = new Button(questionFour, SWT.CHECK);
			qf2.setText("Daisy");
		Button qf3 = new Button(questionFour, SWT.CHECK);
			qf3.setText("Iris");
		Button qf4 = new Button(questionFour, SWT.CHECK);
			qf4.setText("Franigipani");
		Button qf5 = new Button(questionFour, SWT.CHECK);
			qf5.setText("Tiger Lilly");
		Button qf6 = new Button(questionFour, SWT.CHECK);
			qf6.setText("Lotus");
		/*create Question 5 group "What's your main goal in life" 
			Create TextField
			add label with "Have you completed this goal yet"
			Add radio buttons "Yes!" "No"*/
		Group questionFive = new Group(shell, SWT.SHADOW_IN);
		questionFive.setText("What's Your Main Goal In Life");
		questionFive.setLayout(new RowLayout(SWT.VERTICAL));
		Text qfit = new Text (questionFive, SWT.BORDER);
		Label qfil = new Label(questionFive, SWT.NONE);
		Button qfib1 = new Button(questionFive,SWT.RADIO);
				qfib1.setText("Yes!");
		Button qfib2 = new Button(questionFive,SWT.RADIO);
				qfib2.setText("No");
		/*create Question 6 group "random number time!"
			add radio Buttons "1,2,3,4,5,6,7,8,9,10"*/
		Group questionSix = new Group(shell, SWT.SHADOW_IN);
		questionSix.setText("Random Number Time");
		questionSix.setLayout(new RowLayout(SWT.VERTICAL));
		Button qs1 = new Button(questionSix, SWT.RADIO);
			qs1.setText("1");
		Button qs2 = new Button(questionSix, SWT.RADIO);
			qs2.setText("2");
		Button qs3 = new Button(questionSix, SWT.RADIO);
			qs3.setText("3");
		Button qs4 = new Button(questionSix, SWT.RADIO);
			qs4.setText("4");
		Button qs5 = new Button(questionSix, SWT.RADIO);
			qs5.setText("5");
		Button qs6 = new Button(questionSix, SWT.RADIO);
			qs6.setText("6");
		Button qs7 = new Button(questionSix, SWT.RADIO);
			qs7.setText("7");
		Button qs8 = new Button(questionSix, SWT.RADIO);
			qs8.setText("8");
		Button qs9 = new Button(questionSix, SWT.RADIO);
			qs9.setText("9");
		Button qs10 = new Button(questionSix, SWT.RADIO);
			qs10.setText("10");
		//create "Submit" button
		Button s = new Button (shell, SWT.PUSH);
		s.setText("Submit");
		s.addSelectionListener(new SelectionListener() {
			 public void widgetDefaultSelected(SelectionEvent e) {
		      }

			
			public void widgetSelected(SelectionEvent e) {
				Group answers = new Group(shell, SWT.NO_RADIO_GROUP);
				answers.setText("Answers!!!");
				answers.setLayout(new RowLayout(SWT.VERTICAL));
				//label for name, date, gender and age
			    Label al1 = new Label(answers, SWT.NONE);
			    if(ggr1.getSelection()) {
			    	al1.setText("hey hey " + tf1.getText() + " On " + tf2.getText() + " You claim to be Male and Age " + tf3.getText());
			    }
			    if(ggr2.getSelection()) {
			    	al1.setText("hey hey " + tf1.getText() + " On " + tf2.getText() + " You claim to be Female and Age " + tf3.getText());
			    }
			    if(ggr3.getSelection()) {
			    	al1.setText("hey hey " + tf1.getText() + " On " + tf2.getText() + " You claim to be Other and Age " + tf3.getText());
			    }
			    //label for question 1 
			    Label alqo0 = new Label(answers, SWT.NONE);
			    	alqo0.setText("The Fruit You Like is ");
			    if(qo1.getSelection()) {
			    Label alqo1 = new Label(answers, SWT.NONE);
			    	alqo1.setText("Apples, ");
			    }
			    if(qo2.getSelection()) {
				    Label alqo2 = new Label(answers, SWT.NONE);
				    	alqo2.setText("Pineapples, ");
			    }
			    if(qo3.getSelection()) {
				    Label alqo3 = new Label(answers, SWT.NONE);
				    	alqo3.setText("Dragonfruit, ");
			    }
			    if(qo4.getSelection()) {
				    Label alqo4 = new Label(answers, SWT.NONE);
				    	alqo4.setText("Orange, ");
			    }
			    if(qo5.getSelection()) {
				    Label alqo5 = new Label(answers, SWT.NONE);
				    	alqo5.setText("Strawberries, ");
			    }
			    if(qo6.getSelection()) {
				    Label alqo6 = new Label(answers, SWT.NONE);
				    	alqo6.setText("Manadarines, ");
			    }
			    if(qo7.getSelection()) {
				    Label alqo7 = new Label(answers, SWT.NONE);
				    	alqo7.setText("Bananas, ");
			    }
			    //label for question 2
			    Label alq2 = new Label(answers, SWT.NONE);
			    if(qt1.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Wolf");
			    }
			    if(qt2.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Tiger");
			    }
			    if(qt3.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Lion");
			    }
			    if(qt4.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Deer");
			    }
			    if(qt5.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Rabbit");
			    }
			    if(qt6.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Dolphin");
			    }
			    if(qt7.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Bear");
			    }
			    if(qt8.getSelection()) {
			    	alq2.setText("You're Favourite Animal is a Eagle");
			    }
			    //label for question 3 
			    Label alq3 = new Label(answers, SWT.SHADOW_IN);
			    if(qth1.getSelection()) {
			    	alq3.setText("You like the colour Red");
			    }
			    if(qth2.getSelection()) {
			    	alq3.setText("You like the colour Black");
			    }
			    if(qth3.getSelection()) {
			    	alq3.setText("You like the colour White");
			    }
			    if(qth4.getSelection()) {
			    	alq3.setText("You like the colour Purple");	
			    }
			    if(qth5.getSelection()) {
			    	alq3.setText("You like the colour Yellow");
			    }
			    if(qth6.getSelection()) {
			    	alq3.setText("You like the colour Green");
			    }
			    if(qth7.getSelection()) {
			    	alq3.setText("You like the colour Orange");
			    }
			    if(qth8.getSelection()) {
			    	alq3.setText("You like the colour Brown");
			    }
			    if(qth9.getSelection()) {
			    	alq3.setText("You like the colour Blue");
			    }
			    if(qth10.getSelection()) {
			    	alq3.setText("You like the colour Pink");
			    }
			    
			    //label for question 4 
			    Label alq4 = new Label(answers, SWT.NONE);
			    	alq4.setText("The Flowers you like are");
			    if(qf1.getSelection()) {
			    	Label alqf1 = new Label(answers, SWT.NONE);
			    		alqf1.setText("Roses the flower of Passion");
			    }
			    if(qf2.getSelection()) {
			    	Label alqf2 = new Label(answers, SWT.NONE);
			    		alqf2.setText("Dasiy the flower of Purity");
			    }
			    if(qf3.getSelection()) {
			    	Label alqf3 = new Label(answers, SWT.NONE);
			    		alqf3.setText("Iris the flower of Hope ");
			    }
			    if(qf4.getSelection()) {
			    	Label alqf4 = new Label(answers, SWT.NONE);
			    		alqf4.setText("Franigipani the flower of Strength to withstand tough challenges");
			    }
			    if(qf5.getSelection()) {
			    	Label alqf5 = new Label(answers, SWT.NONE);
			    	alqf5.setText("Tiger Lilly the flower of Wealth");
			    }
			    if(qf6.getSelection()) {
			    	Label alqf6 = new Label(answers, SWT.NONE);
			    	alqf6.setText("Lotous the flower of Devotion ");
			    }
			    //label for question 5
			    Label alqfi0 = new Label(answers, SWT.NONE);
			    	alqfi0.setText("You're main goal in life is to " + qfit.getText());
			    Label alqfi1 = new Label(answers, SWT.NONE);
			    if(qfib1.getSelection()) {
			    	alqfi1.setText("Good on you!!!");
			    }
			    if(qfib2.getSelection()) {
			    	alqfi1.setText("All good keep trying you'll get there");
			    }
			    //label for question 6
			    Label alqss = new Label(answers, SWT.NONE);
			    	alqss.setText("You chose number ");
			    Label alqs6 = new Label(answers, SWT.NONE);
			    if(qs1.getSelection()) {
			    	alqs6.setText("1. Use Everyday as an opportunity to make tomorrow even better");
			    }
			    if(qs2.getSelection()) {
			    	alqs6.setText("2. We see things not as they are but as we are - H.M Tomlinson");
			    }
			    if(qs3.getSelection()) {
			    	alqs6.setText("3. You never fail until you stop trying");
			    }
			    if(qs4.getSelection()) {
			    	alqs6.setText("4. You don't have to be great to start, but you have to start to be great - Zig Zagler");
			    }
			    if(qs5.getSelection()) {
			    	alqs6.setText("5. Everyday may not be good, but there is something good in everyday");
			    }
			    if(qs6.getSelection()) {
			    	alqs6.setText("6. Belive you can and you're halfway there -Theodore Roosevelt");
			    }
			    if(qs7.getSelection()) {
			    	alqs6.setText("7. You have to fight throught some bad days to earn the best days of your life");
			    }
			    if(qs8.getSelection()) {
			    	alqs6.setText("8. The quieter you become the more you can hear - Ram Dass");
			    }
			    if(qs9.getSelection()) {
			    	alqs6.setText("9. Be yourself. There is something that you can do better than any other. Listen to the inward voice and bravely obey that.");
			    }
			    if(qs10.getSelection()) {
			    	alqs6.setText("10. Everything you have ever wanted is on the other side of fear");
			    }
			}
		});
  
		shell.setSize(1200,1000);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
		

	}

}
