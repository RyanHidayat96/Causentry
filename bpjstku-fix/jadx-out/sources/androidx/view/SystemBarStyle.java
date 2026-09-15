package androidx.view;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0013R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "", "p0", "p1", "p2", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "p3", "<init>", "(IIILkotlin/jvm/functions/Function1;)V", "getScrim$activity", "(Z)I", "getScrimWithEnforcedContrast$activity", "lightScrim", "I", "darkScrim", "getDarkScrim$activity", "()I", "nightMode", "getNightMode$activity", "detectDarkMode", "Lkotlin/jvm/functions/Function1;", "getDetectDarkMode$activity", "()Lkotlin/jvm/functions/Function1;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystemBarStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int darkScrim;
    private final Function1<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i, int i2, int i3, Function1<? super Resources, Boolean> function1) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = function1;
    }

    /* JADX INFO: renamed from: getDarkScrim$activity, reason: from getter */
    public final int getDarkScrim() {
        return this.darkScrim;
    }

    /* JADX INFO: renamed from: getNightMode$activity, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final Function1<Resources, Boolean> getDetectDarkMode$activity() {
        return this.detectDarkMode;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "<init>", "()V", "", "p0", "p1", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "p2", "Landroidx/activity/SystemBarStyle;", "auto", "(IILkotlin/jvm/functions/Function1;)Landroidx/activity/SystemBarStyle;", "dark", "(I)Landroidx/activity/SystemBarStyle;", "light", "(II)Landroidx/activity/SystemBarStyle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, Function1 function1, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                function1 = new Function1() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(SystemBarStyle.Companion.auto$lambda$0((Resources) obj2));
                    }
                };
            }
            return companion.auto(i, i2, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean auto$lambda$0(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "");
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        @JvmStatic
        public final SystemBarStyle auto(int p0, int p1, Function1<? super Resources, Boolean> p2) {
            Intrinsics.checkNotNullParameter(p2, "");
            return new SystemBarStyle(p0, p1, 0, p2, null);
        }

        @JvmStatic
        public final SystemBarStyle dark(int p0) {
            return new SystemBarStyle(p0, p0, 2, new Function1() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SystemBarStyle.Companion.dark$lambda$0((Resources) obj));
                }
            }, null);
        }

        @JvmStatic
        public final SystemBarStyle light(int p0, int p1) {
            return new SystemBarStyle(p0, p1, 1, new Function1() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SystemBarStyle.Companion.light$lambda$0((Resources) obj));
                }
            }, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean dark$lambda$0(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean light$lambda$0(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "");
            return false;
        }

        @JvmStatic
        public final SystemBarStyle auto(int i, int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }
    }

    public final int getScrim$activity(boolean p0) {
        return p0 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity(boolean p0) {
        if (this.nightMode == 0) {
            return 0;
        }
        if (p0) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, function1);
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i, int i2) {
        return INSTANCE.auto(i, i2);
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i, int i2, Function1<? super Resources, Boolean> function1) {
        return INSTANCE.auto(i, i2, function1);
    }

    @JvmStatic
    public static final SystemBarStyle dark(int i) {
        return INSTANCE.dark(i);
    }

    @JvmStatic
    public static final SystemBarStyle light(int i, int i2) {
        return INSTANCE.light(i, i2);
    }
}
