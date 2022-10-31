import product.Product;
import product.ProductList;
import product.Recipe;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product meat = new Product("Мясо", 450.0f, 1);
        Product fish = new Product("Рыба", 350.0f, 2);
        ProductList productList = new ProductList();
        productList.addProduct(meat);
        productList.addProduct(fish);

        System.out.println(productList);
        Product tomato = new Product("Томат", 60.0f, 5);
        productList.addProduct(tomato);
        System.out.println(productList);

        Recipe recipe = new Recipe("Rec1", Set.of(meat, fish));

        nubmersSetRemoveEven();
    }

    //                  Задание 2-2
//        Создайте множество целых чисел. Заполните множество 20 случайными числами в диапазоне от 0 до 1000.
//        Пройдитесь по всем элементам множества и удалите из него все нечетные значения. Выведите оставшиеся элементы в консоль.
    private static void nubmersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}