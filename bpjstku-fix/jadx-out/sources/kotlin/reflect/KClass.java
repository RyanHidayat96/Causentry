package kotlin.reflect;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H¦\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010 \u001a\u0004\u0018\u00018\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8'X§\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010+\u001a\b\u0012\u0004\u0012\u00020(0!8'X§\u0004¢\u0006\f\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$R(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00000!8'X§\u0004¢\u0006\f\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010$R\u001c\u00103\u001a\u0004\u0018\u00010/8'X§\u0004¢\u0006\f\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101R\u001a\u00104\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\b6\u0010&\u001a\u0004\b4\u00105R\u001a\u00107\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\b8\u0010&\u001a\u0004\b7\u00105R\u001a\u00109\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\b:\u0010&\u001a\u0004\b9\u00105R\u001a\u0010;\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\b<\u0010&\u001a\u0004\b;\u00105R\u001a\u0010=\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\b>\u0010&\u001a\u0004\b=\u00105R\u001a\u0010?\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\b@\u0010&\u001a\u0004\b?\u00105R\u001a\u0010A\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\bB\u0010&\u001a\u0004\bA\u00105R\u001a\u0010C\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\bD\u0010&\u001a\u0004\bC\u00105R\u001a\u0010E\u001a\u00020\u00078'X§\u0004¢\u0006\f\u0012\u0004\bF\u0010&\u001a\u0004\bE\u00105"}, d2 = {"Lkotlin/reflect/KClass;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "p0", "", "isInstance", "(Ljava/lang/Object;)Z", "equals", "", "hashCode", "()I", "", "getSimpleName", "()Ljava/lang/String;", "simpleName", "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "()V", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "getSupertypes$annotations", "supertypes", "getSealedSubclasses", "getSealedSubclasses$annotations", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isData", "isData$annotations", "isInner", "isInner$annotations", "isCompanion", "isCompanion$annotations", "isFun", "isFun$annotations", "isValue", "isValue$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getSealedSubclasses$annotations() {
        }

        public static /* synthetic */ void getSupertypes$annotations() {
        }

        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        public static /* synthetic */ void getVisibility$annotations() {
        }

        public static /* synthetic */ void isAbstract$annotations() {
        }

        public static /* synthetic */ void isCompanion$annotations() {
        }

        public static /* synthetic */ void isData$annotations() {
        }

        public static /* synthetic */ void isFinal$annotations() {
        }

        public static /* synthetic */ void isFun$annotations() {
        }

        public static /* synthetic */ void isInner$annotations() {
        }

        public static /* synthetic */ void isOpen$annotations() {
        }

        public static /* synthetic */ void isSealed$annotations() {
        }

        public static /* synthetic */ void isValue$annotations() {
        }
    }

    boolean equals(Object p0);

    Collection<KFunction<T>> getConstructors();

    @Override // kotlin.reflect.KDeclarationContainer
    Collection<KCallable<?>> getMembers();

    Collection<KClass<?>> getNestedClasses();

    T getObjectInstance();

    String getQualifiedName();

    List<KClass<? extends T>> getSealedSubclasses();

    String getSimpleName();

    List<KType> getSupertypes();

    List<KTypeParameter> getTypeParameters();

    KVisibility getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    boolean isInstance(Object p0);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();
}
