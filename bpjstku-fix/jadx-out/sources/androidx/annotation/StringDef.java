package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0011\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/annotation/StringDef;", "", "", "p0", "", "p1", "open", "()Z", "", "value", "()[Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface StringDef {
    boolean open() default false;

    String[] value() default {};
}
