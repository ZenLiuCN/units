package cn.zenliu.units.codegen;

import org.immutables.value.Value;

import java.util.List;

/**
 * A Simple Model to presents a Source Code
 *
 * @author Zen.Liu
 * @since 2023-05-08
 */
@Value.Immutable
@Value.Enclosing
@Value.Style(
        typeImmutable = "*Val"
)
public interface Modification {
    List<Type> types();

    List<Field> fields();

    List<Method> methods();

    @Value.Immutable
    interface Pair<K, V> {
        K k();

        V v();
    }

    interface Modifier {
        int modifier();
    }

    interface Parameter {
        List<Pair<String, String>> parameter();
    }

    interface TypeName {
        String simpleName();

        default String name() {
            return pkg() + "." + simpleName();
        }

        String pkg();
    }

    interface Fields {
        List<Field> field();
    }

    interface Methods {
        List<Method> methods();
    }

    @Value.Immutable
    interface Field extends Modifier {
        String className();

    }

    @Value.Immutable
    interface Method extends Modifier, Parameter {
        int modifier();

        String returns();


    }

    @Value.Immutable
    interface Type extends Modifier, TypeName, Fields, Methods {

    }
}
