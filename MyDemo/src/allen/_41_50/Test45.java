package allen._41_50;

/*计算多选题得分*/
public class Test45 {

	public static void main(String[] args) {
		 System.out.println(examinee("ADC","ABDC",6));
		 
	}
	public static float examinee(String answer,String standardAnswer,float score) 
	{
		float newScore = 0f;
		if(standardAnswer.length()==1)//单选
		{
			if(standardAnswer.equals(answer))
			{
				newScore=score;
			}
		}
		else//多选题
		{
			if(answer.length()<standardAnswer.length())
			{
				char [] answerArr =answer.toCharArray();
				//判断answerArr中的字符是否全在standardAnswerArr中 如果是就得一半分
				int flag = 1 ;//标志，一旦有一个字符不在standardAnswerArr中 就变为 0,不得分
				for(int i=0;i<answerArr.length;i++)
				{
					if(standardAnswer.indexOf(String.valueOf(answerArr[i]))==-1)
					{
						flag = 0;
					}
				}
				if(flag==1)
				{
					newScore=score/2;
				}
			}
			else if(answer.length()==standardAnswer.length())
			{
				char [] answerArr =answer.toCharArray();
				//判断answerArr中的字符是否全在standardAnswerArr中 如果是就得全分
				int flag = 1 ;//标志，一旦有一个字符不在standardAnswerArr中 就变为 0,不得分
				for(int i=0;i<answerArr.length;i++)
				{
					if(standardAnswer.indexOf(String.valueOf(answerArr[i]))==-1)
					{
						flag = 0;
					}
				}
				if(flag==1)
				{
					newScore=score;
				}
			}
		}
		return newScore;
	}
}
