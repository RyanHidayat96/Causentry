package androidx.p002lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00100\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR2\u0010!\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0 0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "<init>", "()V", "p0", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleEventObserver", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "p1", "createGeneratedAdapter", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/GeneratedAdapter;", "Ljava/lang/Class;", "generatedConstructor", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "getObserverConstructorType", "(Ljava/lang/Class;)I", "resolveObserverCallbackType", "", "isLifecycleParent", "(Ljava/lang/Class;)Z", "", "getAdapterName", "(Ljava/lang/String;)Ljava/lang/String;", "REFLECTIVE_CALLBACK", "I", "GENERATED_CALLBACK", "", "callbackCache", "Ljava/util/Map;", "", "classToAdapters"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    @JvmStatic
    public static final LifecycleEventObserver lifecycleEventObserver(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        boolean z = p0 instanceof LifecycleEventObserver;
        boolean z2 = p0 instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) p0, (LifecycleEventObserver) p0);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) p0, null);
        }
        if (z) {
            return (LifecycleEventObserver) p0;
        }
        Class<?> cls = p0.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
            Intrinsics.checkNotNull(list);
            List<Constructor<? extends GeneratedAdapter>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), p0));
            }
            int size = list2.size();
            GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
            for (int i = 0; i < size; i++) {
                generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter(list2.get(i), p0);
            }
            return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new ReflectiveGenericLifecycleObserver(p0);
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> p0, Object p1) {
        try {
            GeneratedAdapter generatedAdapterNewInstance = p0.newInstance(p1);
            Intrinsics.checkNotNull(generatedAdapterNewInstance);
            return generatedAdapterNewInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> p0) {
        try {
            Package r0 = p0.getPackage();
            String canonicalName = p0.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            Intrinsics.checkNotNull(name);
            if (name.length() != 0) {
                Intrinsics.checkNotNull(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "");
            }
            Intrinsics.checkNotNull(canonicalName);
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append('.');
                sb.append(adapterName);
                adapterName = sb.toString();
            }
            Class<?> cls = Class.forName(adapterName);
            Intrinsics.checkNotNull(cls, "");
            Constructor declaredConstructor = cls.getDeclaredConstructor(p0);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final int getObserverConstructorType(Class<?> p0) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(p0);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(p0);
        map.put(p0, Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final int resolveObserverCallbackType(Class<?> p0) {
        ArrayList arrayList;
        if (p0.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(p0);
        if (constructorGeneratedConstructor != null) {
            classToAdapters.put(p0, CollectionsKt.listOf(constructorGeneratedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(p0)) {
            return 1;
        }
        Class<? super Object> superclass = p0.getSuperclass();
        if (isLifecycleParent(superclass)) {
            Intrinsics.checkNotNull(superclass);
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
            Intrinsics.checkNotNull(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Iterator it = ArrayIteratorKt.iterator(p0.getInterfaces());
        while (it.hasNext()) {
            Class<?> cls = (Class) it.next();
            if (isLifecycleParent(cls)) {
                Intrinsics.checkNotNull(cls);
                if (getObserverConstructorType(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls);
                Intrinsics.checkNotNull(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(p0, arrayList);
        return 2;
    }

    private final boolean isLifecycleParent(Class<?> p0) {
        return p0 != null && LifecycleObserver.class.isAssignableFrom(p0);
    }

    @JvmStatic
    public static final String getAdapterName(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.replace$default(p0, ".", "_", false, 4, (Object) null));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
