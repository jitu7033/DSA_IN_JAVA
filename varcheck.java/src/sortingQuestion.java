public class sortingQuestion {
    static void questionOne(int [] a){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(a[j]==0 && a[j+1]!=0) {
                    if (a[j] < a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        flag = true;
                    }
                }
            }
            if(!flag) return;
        }

    }

    // lexicographical  solved
    static void stringQuestion(String []s){
        for(int i=0; i<s.length; i++){
            int minIndex = i;
            for(int j=i+1; j<s.length; j++){
                if(s[j].compareTo(s[minIndex])<0){
                    minIndex = j;
                }
            }
            //swap fruits of main index and current index
            String temp = s[i];
            s[i] = s[minIndex];
            s[minIndex] = temp;


        }

    }

    // lexicographical solved an array in integer;

    static void lexicographical(String []a){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            int  minIndex = i;
            for(int j=i+1; j<n; j++){
                if(a[j].compareTo(a[minIndex])<0){
                    minIndex = j;
                }
            }
            // swap
            String temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }


    public static void main(String[] args) {
        String [] a = {"10","100","20","30"};
        String s[] = {"apple","abcd","kiwi","papaya","banana","tomato"};
//        questionOne(a);
//        //print array;
//        for(int i: a){
//            System.out.print(i+" ");
//        }
        System.out.println();
        stringQuestion(s);
        for(String i: s){
            System.out.print(i+" ");
        }
        System.out.println();

        lexicographical(a);
        for(String i:a){
            System.out.print(i+" ");
        }


    }
}
