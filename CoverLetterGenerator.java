
import java.util.Scanner;
public class CoverLetterGenerator 
{
	static Scanner keyboard = new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.print("Company Name: ");
		String company = keyboard.nextLine();
		System.out.print("Position: ");
		String position = keyboard.nextLine();
		System.out.print(company + ", \n"
				+ "\n"
				+ "I am writing to express my strong interest in the "
				+ position + " position at " + company + ", "
				+ "as advertised on your company's website. With a passion for "
				+ "problem solving and a proven track record in delivering "
				+ "innovative solutions, I am excited about the opportunity to "
				+ "contribute to " + company + "’s team. " + company + "’s reputation "
				+ "for innovation and its commitment to pushing the boundaries of "
				+ "technology are highly appealing to me. I am eager to be part of a "
				+ "company that values creativity, teamwork, and continuous learning. "
				+ "I believe that my skills and passion align perfectly with " + company
				+ "’s mission and the " + position + "role. "
				+ "My resume provides further details on my professional background, "
				+ "technical skills, and accomplishments. I welcome the opportunity to "
				+ "discuss how my qualifications match your organization's needs and "
				+ "goals in more detail. Thank you for considering my application. "
				+ "I am excited about the possibility of joining the " + company  
				+ " team and contributing to your continued success. Please feel free "
				+ "to reach out to me at 404-804-4814 or kaylamcguinn@gmail.com to "
				+ "arrange an interview at your convenience. \n"
				+ "\n"
				+ "Sincerely, Kayla McGuinn\n"
				+ "");
	}
}
