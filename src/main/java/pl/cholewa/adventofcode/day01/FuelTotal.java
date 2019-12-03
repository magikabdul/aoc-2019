package pl.cholewa.adventofcode.day01;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FuelTotal {

    private List<Integer> masses = new ArrayList<>();

    public void createExampleData() {
        masses = Arrays.asList(12, 14, 1969, 100756);
    }

    public void createTaskData() {
        masses = Arrays.asList(73910,
                57084,
                102852,
                134452,
                108006,
                134228,
                102765,
                60642,
                64819,
                54335,
                82480,
                135119,
                73027,
                107087,
                108254,
                111944,
                83790,
                128585,
                52889,
                53870,
                145120,
                96863,
                57105,
                97702,
                75324,
                70566,
                120914,
                95808,
                86568,
                143498,
                125093,
                71370,
                122889,
                67808,
                133643,
                52806,
                103532,
                126487,
                54807,
                121402,
                57580,
                75759,
                84225,
                102232,
                112367,
                95635,
                132871,
                102903,
                51997,
                74565,
                63674,
                97410,
                96965,
                55711,
                53547,
                117482,
                107957,
                108175,
                136622,
                144235,
                80407,
                78670,
                114870,
                145967,
                148646,
                75955,
                84293,
                129590,
                144067,
                142192,
                79117,
                123861,
                68546,
                148675,
                88932,
                91493,
                127808,
                96517,
                130687,
                137822,
                77726,
                110502,
                130509,
                98370,
                136008,
                142920,
                81358,
                112950,
                101057,
                86547,
                128714,
                135401,
                55903,
                66606,
                105404,
                55276,
                57427,
                101556,
                91111,
                79585);
    }

    public int getSize() {
        return masses.size();
    }

    public int getRequiredFuel() {
        int value = masses.stream().map(FuelCalculator::calculateFuel).mapToInt(Double::intValue).sum();
        return value;
    }
}
