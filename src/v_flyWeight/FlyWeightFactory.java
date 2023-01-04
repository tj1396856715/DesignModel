package v_flyWeight;

import java.util.HashMap;

/**
 * @author Tang
 * @Date 2023-01-04-13:05
 */
// 享元工厂，用来创建并管理Flyweight对象，主要用来确保合理地共享Flyweight
public class FlyWeightFactory {

    private HashMap<String, FlyWeight> flyWeights = new HashMap<>();

    public FlyWeightFactory() {
        flyWeights.put("X", new ConcreteFlyWeight());
        flyWeights.put("Y", new ConcreteFlyWeight());
        flyWeights.put("Z", new ConcreteFlyWeight());
    }

    public FlyWeight getFlyWeight(String key) {
        return flyWeights.get(key);
    }
}
