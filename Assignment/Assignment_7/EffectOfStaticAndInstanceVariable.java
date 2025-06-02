public class EffectOfStaticAndInstanceVariable {
    int result;
    static int operationCount;
    void add(int a,int b){
        result = a+b;
        System.out.println(result);
    }
    static void displayOperationCount(){
        operationCount = 1;
        System.out.println(operationCount);
    }
    public static void main(String[] args) {
        EffectOfStaticAndInstanceVariable obj = new EffectOfStaticAndInstanceVariable();
        obj.result = 1;
        operationCount = 2;
        obj.add(10,20);
        displayOperationCount();
    }
}