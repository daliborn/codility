class Solution 
{
    public int [] solution(int [] A, int K) 
    {
        int[] B = new int[A.length];
        if (A.length == 1)
            return A;

        for (int i = 0; i < B.length; i++) {
            if (i + K > B.length) {
                int index = Math.abs(A.length - (i + K - 1));

                B[i] = A[index];
            }
            else {
                B[i] = A[i + K - 1];
            }
        }
        return B;
    }
}
