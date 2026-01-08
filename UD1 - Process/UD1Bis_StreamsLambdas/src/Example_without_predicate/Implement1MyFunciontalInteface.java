package Example_without_predicate;

public class Implement1MyFunciontalInteface implements MyFunctionalInterface{
    @Override
    public boolean filtrar(String elemento) {
        if (elemento.startsWith("J"))
            return true;
        else
            return false;
    }
}
