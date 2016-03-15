import javax.swing.JOptionPane;

public class Exercise {
	public static void main (String [] args){
	String s1="";
	s1= JOptionPane.showInputDialog("please enter the number of people");
	double dbls1;
	dbls1=Double.parseDouble(s1);
	String s2="";
	s2= JOptionPane.showInputDialog("please enter the number of player");
	double dbls2;
	dbls2=Double.parseDouble(s2);
	if(dbls1>10){
		JOptionPane.showMessageDialog(null,"the group size is :"+ dbls1/2);
		
		
	}else{
		if(dbls1>=3 && dbls1<=10){
			JOptionPane.showMessageDialog(null,"the group size is :"+ dbls1/3);
			}else{
				JOptionPane.showMessageDialog(null,"The number of people has to be at least 3");
			}
		
		
	}
	if(dbls2>=11 &&dbls2<=55){
		JOptionPane.showMessageDialog(null,"the team size is :"+ dbls2/11);
		}else{
			JOptionPane.showMessageDialog(null,"the team size is 1");
		}

}
}
