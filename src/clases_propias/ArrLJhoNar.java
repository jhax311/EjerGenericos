package clases_propias;

import java.util.ArrayList;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 *
 */
public class ArrLJhoNar {

    public static <T extends Comparable> T getMenor(ArrayList<T> a) {
        if (a == null || a.isEmpty()) {
            return null;
        }
        T eleMenor = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (eleMenor.compareTo(a.get(i)) > 0) eleMenor = a.get(i);
        }
        return eleMenor;
    }

        public static <T extends Comparable> T getMayor(ArrayList<T> a) {
        if (a == null || a.isEmpty()) {
            return null;
        }
        T eleMayor = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (eleMayor.compareTo(a.get(i)) < 0) eleMayor = a.get(i);
        }
        return eleMayor;
    }
}
