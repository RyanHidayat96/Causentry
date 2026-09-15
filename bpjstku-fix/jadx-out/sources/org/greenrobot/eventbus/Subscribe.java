package org.greenrobot.eventbus;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Subscribe {
    int TuitionPaymentFragmentbindingInflater1() default 0;

    ThreadMode TuitionPaymentFragmentspecialinlinedviewModeldefault1() default ThreadMode.POSTING;

    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() default false;
}
