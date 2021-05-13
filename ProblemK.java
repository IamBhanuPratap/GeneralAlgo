package problemK;

import java.util.Stack;

public class ProblemK {

	public static void main(String[] args) {
		int A[] = {2,2,2,1};
		int n = A.length;
		boolean status =false;
		Stack<Integer> stackNumber = new Stack<Integer>();
		for(int i = 0; i<n;i++) {
			if(!stackNumber.isEmpty() && stackNumber.peek()==A[i]) {
				stackNumber.pop();
			}
			else {
				stackNumber.push(A[i]);
			}
		}
		if(stackNumber.isEmpty()) {
			status = true;
		}
		System.out.print(status);
		
	}

}
