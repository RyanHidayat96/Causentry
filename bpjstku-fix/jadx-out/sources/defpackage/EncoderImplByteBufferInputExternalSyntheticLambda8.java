package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0006\u0010\u0013"}, d2 = {"LEncoderImplByteBufferInputExternalSyntheticLambda8;", "", "<init>", "()V", "", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "TuitionPaymentFragmentbindingInflater1", "()Ljava/util/List;", ExifInterface.LATITUDE_SOUTH, "Ljava/lang/Class;", "p0", "Ljava/lang/ClassLoader;", "p1", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/net/URL;)Ljava/util/List;", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImplByteBufferInputExternalSyntheticLambda8 {
    public static final EncoderImplByteBufferInputExternalSyntheticLambda8 INSTANCE = new EncoderImplByteBufferInputExternalSyntheticLambda8();

    private EncoderImplByteBufferInputExternalSyntheticLambda8() {
    }

    public final List<MainDispatcherFactory> TuitionPaymentFragmentbindingInflater1() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!EncoderImplByteBufferInputExternalSyntheticLambda7.b()) {
            return TuitionPaymentFragmentbindingInflater1(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return TuitionPaymentFragmentbindingInflater1(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (Throwable unused3) {
            return TuitionPaymentFragmentbindingInflater1(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    private static List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1(URL p0) throws IOException {
        String string = p0.toString();
        if (StringsKt.startsWith$default(string, "jar", false, 2, (Object) null)) {
            String strSubstringBefore$default = StringsKt.substringBefore$default(StringsKt.substringAfter$default(string, "jar:file:", (String) null, 2, (Object) null), '!', (String) null, 2, (Object) null);
            String strSubstringAfter$default = StringsKt.substringAfter$default(string, "!/", (String) null, 2, (Object) null);
            JarFile jarFile = new JarFile(strSubstringBefore$default, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strSubstringAfter$default)), Hex.DEFAULT_CHARSET_NAME));
                try {
                    List<String> listTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    jarFile.close();
                    return listTuitionPaymentFragmentbindingInflater1;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        jarFile.close();
                        throw th4;
                    } catch (Throwable th5) {
                        ExceptionsKt.addSuppressed(th3, th5);
                        throw th3;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(p0.openStream()));
        try {
            List<String> listTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(bufferedReader2);
            CloseableKt.closeFinally(bufferedReader2, null);
            return listTuitionPaymentFragmentbindingInflater2;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                CloseableKt.closeFinally(bufferedReader2, th6);
                throw th7;
            }
        }
    }

    private static List<String> TuitionPaymentFragmentbindingInflater1(BufferedReader p0) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = p0.readLine();
            if (line != null) {
                String string = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(line, "#", (String) null, 2, (Object) null)).toString();
                String str = string;
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                        throw new IllegalArgumentException("Illegal service provider class name: ".concat(String.valueOf(string)).toString());
                    }
                }
                if (str.length() > 0) {
                    linkedHashSet.add(string);
                }
            } else {
                return CollectionsKt.toList(linkedHashSet);
            }
        }
    }

    private static <S> List<S> TuitionPaymentFragmentbindingInflater1(Class<S> p0, ClassLoader p1) {
        try {
            StringBuilder sb = new StringBuilder("META-INF/services/");
            sb.append(p0.getName());
            ArrayList list = Collections.list(p1.getResources(sb.toString()));
            Intrinsics.checkNotNullExpressionValue(list, "");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, TuitionPaymentFragmentspecialinlinedviewModeldefault1((URL) it.next()));
            }
            Set set = CollectionsKt.toSet(arrayList);
            if (set.isEmpty()) {
                throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
            }
            Set set2 = set;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                Class<?> cls = Class.forName((String) it2.next(), false, p1);
                if (p0.isAssignableFrom(cls)) {
                    arrayList2.add(p0.cast(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                } else {
                    StringBuilder sb2 = new StringBuilder("Expected service of class ");
                    sb2.append(p0);
                    sb2.append(", but found ");
                    sb2.append(cls);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
            return arrayList2;
        } catch (Throwable unused) {
            return CollectionsKt.toList(ServiceLoader.load(p0, p1));
        }
    }
}
