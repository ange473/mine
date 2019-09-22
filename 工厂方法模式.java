
abstract class Factory{

    public abstract Product Manufacture();

}
abstract class Product{

    public abstract void Show();

}
class  ProductA extends  Product{

    @Override

    public void Show() {

        System.out.println("生产出了产品A");

    }

}
class  ProductB extends  Product{
 @Override

    public void Show() {

        System.out.println("生产出了产品B");

    }

}
class  FactoryA extends Factory{

    @Override

    public Product Manufacture() {

        return new ProductA();

    }

}
class  FactoryB extends Factory{

    @Override

    public Product Manufacture() {

        return new ProductB();

    }

}
 public class FactoryPattern {

    public static void main(String[] args){

        FactoryA mFactoryA = new FactoryA();

        mFactoryA.Manufacture().Show();

        FactoryB mFactoryB = new FactoryB();

        mFactoryB.Manufacture().Show();

    }

}

结果：

生产出了产品A