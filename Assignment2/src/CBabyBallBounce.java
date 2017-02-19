import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.*;
//import java.util.*;

public class CBabyBallBounce extends JFrame /*implements ChangeListener*/
{

	//private CBabyBallBounce()//declare the title 
	 //{
	//super ("\"CBabyBallBounce - Baby Ball Bounce Application\"");//set the JFrame title
	//Container myContainer = getContentPane();
	// }
	private JPanel panel, panelRight, panelBottom;//calls the center panel, the right panel and the bottom panel
	//private JPanel panelRight;
	//private JPanel panelButtom;
	private Icon iconAct, iconRun, iconReset;//calls the icon
		
	private JTextField JTFDigitalTimer1, JTFDigitalTimer2, JTFDigitalTimer3;//text field for the digital timer1,2,3
		
	private JTextField JTFScoreL, JTFScoreR;//text field for the left and right team score
	
    private JTextField JTFOption, JTFSquare, JTFDirection;//text field for the option, square, direction values
       
    private JLabel timeLabel, timeLabel1,  timeLabel2, scoreLabel, scoreLabelLR, optionLabel, squareLabel, directionLabel;
    
    private JButton JB2Player;//create the button 2Player
    private JButton JB4Player;//create the button 4Player
    private JButton JBMulti;//create the button multi
    private JButton JBExit;//create the button exit
    
    private JButton JBAct;
    private JButton JBRun;
    private JButton JBReset;
    
   /*private JSlider slider;
    private int max =0;*/
    
    public static void main (String[] args) 
     {
    	CBabyBallBounce frame = new CBabyBallBounce();
        frame.setSize(825, 585);//application size
        frame.createGUI();
        frame.show(); 
        
        /*CBabyBallBounce demo = new CBabyBallBounce();
        demo.setSize(50, 50);
        demo.createGUI();
        demo.show();*/
        
    }

    private void createGUI() 
     {  
    	setTitle("\"CBabyBallBounce - Baby Ball Bounce Application\"");//set the title
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        setResizable(false);//fix size
        
        
      
        
        panel = new JPanel();//creates new object which is the panel 
        //panel.setLayout(null);
        panel.setPreferredSize(new Dimension(620, 430));
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        window.add(panel);
       
                     
        panelRight = new JPanel();//creates new object which is the panelRight
        panelRight.setLayout(null);
        panelRight.setPreferredSize(new Dimension(170, 430));
        panelRight.setBorder(BorderFactory.createLineBorder(Color.black));
        window.add(panelRight);
        
        timeLabel = new JLabel (" DIGITAL TIMER ");//add new object JLabel
        //timeLabel.setVerticalAlignment(SwingConstants.CENTER);
        panelRight.add(timeLabel);//add the window for timeLabel
        timeLabel.setLocation(40, 0);//the location of timeLabel
        timeLabel.setSize(100, 25);//the size of timeLabel
        //setVisible(true);//it is visible
                
        JTFDigitalTimer1 = new JTextField(" 00 ");//add new object which is text field and contains zero
        JTFDigitalTimer1.setBackground(Color.black);//set the background color
        JTFDigitalTimer1.setForeground(Color.white);//set the font color
        panelRight.add(JTFDigitalTimer1);////add the text field for the JTFDigital timer1
        JTFDigitalTimer1.setBounds(15, 30, 30, 25);
        
        timeLabel1 = new JLabel (" : ");//add new object which is label and contain ":"
        panelRight.add(timeLabel1);//add the window for the timeLabel
        timeLabel1.setLocation(45, 30);//the location of timeLabel
        timeLabel1.setSize(15, 30);//the size of timeLabel
                
        JTFDigitalTimer2 = new JTextField(" 00 ");//add new object which is text filed and contains zero
        JTFDigitalTimer2.setBackground(Color.black);//set the background color
        JTFDigitalTimer2.setForeground(Color.white);//set the font color
        panelRight.add(JTFDigitalTimer2);//add the text field for the JTFDigital timer2
        JTFDigitalTimer2.setBounds(60, 30, 30, 25);
                
        timeLabel2 = new JLabel (" : ");//add new object which is label and contain ":"
        panelRight.add(timeLabel2);//add the window for the timeLabel
        timeLabel2.setLocation(95, 30);//the location of timeLabel
        timeLabel2.setSize(15, 30);//the size of timeLabel
                
        JTFDigitalTimer3 = new JTextField(" 00 ");
        JTFDigitalTimer3.setBackground(Color.black);//set the background color
        JTFDigitalTimer3.setForeground(Color.white);//set the font color
        panelRight.add(JTFDigitalTimer3);//add the text field for the JTFDigital timer3
        JTFDigitalTimer3.setBounds(110, 30, 30, 25);
                
        
        scoreLabel = new JLabel (" SCORE  ");//add new object JLabel
        scoreLabel.setLocation(30, 50);
        panelRight.add(scoreLabel);//add the window for scoreLabel
        scoreLabel.setLayout(new FlowLayout() );
        scoreLabel.setLocation(50, 55);//the location of timeLabel
        scoreLabel.setSize(100, 30);//the size of timeLabel
                
        JTFScoreL = new JTextField(" 00 ");
        JTFScoreL.setBackground(Color.black);//set the background color
        JTFScoreL.setForeground(Color.white);//set the font color
        panelRight.add(JTFScoreL);//add the text field for the JTFScoreL
        JTFScoreL.setBounds(15, 80, 30, 25);
        
        scoreLabelLR = new JLabel (" < L : R > ");
        panelRight.add(scoreLabelLR);//add the window for scoreLabelLR
        scoreLabelLR.setLocation(48, 80);//the location of scoreLabelLR
        scoreLabelLR.setSize(60, 30);//the size of scoreLabelLR
        
        
        
       /* scoreLabelpoint1 = new JLabel (" < ");//add new object scoreLabelpoint1
        panelRight.add(scoreLabelpoint1);//add the window for scoreLabelpoint1
        scoreLabelpoint1.setLocation(48, 80);//the location of scoreLabelpoint1
        scoreLabelpoint1.setSize(15, 30);//the size of scoreLabelpoint1
        
        scoreLabelL = new JLabel (" L ");//add new object JLabel
        panelRight.add(scoreLabelL);//add the window for scoreLabelL
        scoreLabelL.setLocation(58, 80);//the location of scoreLabelL
        scoreLabelL.setSize(15, 30);//the size of scoreLabelL
                
        scoreLabelC = new JLabel ( " : ");//add new object JLabel
        panelRight.add(scoreLabelC);//add the window for scoreLabelC
        scoreLabelC.setLocation(70, 80);//the location of scoreLabelC
        scoreLabelC.setSize(15, 30);//the size of scoreLabelC
                
        scoreLabelR = new JLabel (" R ");//add new object JLabel
        panelRight.add(scoreLabelR);//add the window for scoreLabelR
        scoreLabelR.setLocation(78, 80);//the location of scoreLabelR
        scoreLabelR.setSize(15, 30);//the size of scoreLabelR
        
        scoreLabelpoint2 = new JLabel (" > ");//add new object scoreLabelpoint2
        panelRight.add(scoreLabelpoint2);//add the window for scoreLabelpoint2
        scoreLabelpoint2.setLocation(90, 80);//the location of scoreLabelpoint2
        scoreLabelpoint2.setSize(15, 30);//the size of scoreLabelpoint2*/
                
        JTFScoreR = new JTextField(" 00 ");//add new object JTFScoreR
        JTFScoreR.setBackground(Color.black);//set the background color
        JTFScoreR.setForeground(Color.white);//set the font color
        panelRight.add(JTFScoreR);//add the text field window for the JTFScoreR
        JTFScoreR.setBounds(110, 80, 30, 25); // //the location and the size of the JTFScoreR           
        
        
        
        optionLabel = new JLabel (" Option: ");//add new object JLabel
        panelRight.add(optionLabel);//add the window for optionLabel
        optionLabel.setLocation(5, 110);//the location of timeLabel
        optionLabel.setSize(100, 25);//the size of timeLabel
                          
        JTFOption = new JTextField(" 2 Player ");
        panelRight.add(JTFOption);//add the text field window for the JTFOption
        panelRight.add(JTFScoreR);//add the text field window for the JTFOption
        JTFOption.setBounds(90, 110, 90, 25);   //the location and the size of the JTFOption
                
        squareLabel = new JLabel (" Square: ");//add new object JLabel
        panelRight.add(squareLabel);//add the window for squareLabel
        squareLabel.setLocation(5, 140);//the location of timeLabel
        squareLabel.setSize(100, 25);//the size of timeLabel
                
        JTFSquare = new JTextField(" 101 ");
        panelRight.add(JTFSquare);//add the text field window for the LTFSquare
        panelRight.add(JTFSquare);//add the text field window for the JTFSquare
        JTFSquare.setBounds(90, 140, 90, 25);   //the location and the size of the JTFSquare
        
        directionLabel = new JLabel (" Direction ");//add new object JLabel
        panelRight.add(directionLabel);//add the window fordirectionLabel
        directionLabel.setLocation(5, 170);//the location of timeLabel
        directionLabel.setSize(100, 25);//the size of timeLabel
                
        JTFDirection = new JTextField(" SE ");//add the text field window for the LTFDirection
        panelRight.add(JTFDirection);//add the text field window for the JTFDirection
        JTFDirection.setBounds(90, 170, 90, 25); //the location and the size of the JTFDirection
                         
               
        panelBottom = new JPanel();//creates new object which is the panelBottom
        panelBottom.setPreferredSize(new Dimension(800, 80));
        panelBottom.setBorder(BorderFactory.createLineBorder(Color.black));
        window.add(panelBottom);
        
       /* slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 1);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.add(ChangeListener(this));
        panelBottom.add(slider);*/
      
        iconAct = new ImageIcon("pictures/step.png");//creates the picture for the act button
        iconRun = new ImageIcon("pictures/run.png");//creates the picture for the run button
        iconReset = new ImageIcon("picturse/reset.png");//creates the picture for the run button
              
        
       
        
        
       
       
        
        JB2Player = new JButton("2 Player");//add new object button which is called JB2Player and it writes "2 Player" 
        panelRight.add(JB2Player);//add the window for the button JB2Player
        
        JB4Player = new JButton("4 Player");//add new object JB4Player
        panelRight.add(JB4Player);//add the window for the button JB4Palyer
        
        JBMulti = new JButton("Multi");
        panelRight.add(JBMulti);//add the window for the button JBMulti
        
        JBExit = new JButton("Exit");
        panelRight.add(JBExit);//add the window for the JBExit
        
       
        JBAct = new JButton("Act");//add new object JBAct
        JBAct.setIcon(iconAct);//set the iconAct
        //System.err.println("Act");//print the picture of the button act
        panelBottom.add(JBAct);//add the window for the JBAct
        
        
        JBRun = new JButton("Run");
        JBRun.setIcon(iconRun);//set the iconRun
        //System.err.println("Run");
        panelBottom.add(JBRun);//add the window for the JBRun
        
        
        
        
        JBReset = new JButton("Reset");
        JBReset.setIcon(iconReset);//set the iconReset
        panelBottom.add(JBReset);//add the window for the JBReset
        
        
    }

	

	
	
	}