package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "<init>", "()V", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "p0", "Landroid/text/StaticLayout;", "create", "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", "", "p1", "isFallbackLineSpacingEnabled", "(Landroid/text/StaticLayout;Z)Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isInitialized;
    private static Constructor<StaticLayout> staticLayoutConstructor;

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final boolean isFallbackLineSpacingEnabled(StaticLayout p0, boolean p1) {
        return false;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;", "", "<init>", "()V", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "getStaticLayoutConstructor", "()Ljava/lang/reflect/Constructor;", "", "isInitialized", "Z", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (StaticLayoutFactoryDefault.isInitialized) {
                return StaticLayoutFactoryDefault.staticLayoutConstructor;
            }
            StaticLayoutFactoryDefault.isInitialized = true;
            try {
                StaticLayoutFactoryDefault.staticLayoutConstructor = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryDefault.staticLayoutConstructor = null;
            }
            return StaticLayoutFactoryDefault.staticLayoutConstructor;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final StaticLayout create(StaticLayoutParams p0) {
        Constructor staticLayoutConstructor2 = INSTANCE.getStaticLayoutConstructor();
        StaticLayout staticLayout = null;
        if (staticLayoutConstructor2 != null) {
            try {
                CharSequence text = p0.getText();
                int start = p0.getStart();
                int end = p0.getEnd();
                staticLayout = (StaticLayout) staticLayoutConstructor2.newInstance(text, Integer.valueOf(start), Integer.valueOf(end), p0.getPaint(), Integer.valueOf(p0.getWidth()), p0.getAlignment(), p0.getTextDir(), Float.valueOf(p0.getLineSpacingMultiplier()), Float.valueOf(p0.getLineSpacingExtra()), Boolean.valueOf(p0.getIncludePadding()), p0.getEllipsize(), Integer.valueOf(p0.getEllipsizedWidth()), Integer.valueOf(p0.getMaxLines()));
            } catch (IllegalAccessException unused) {
                staticLayoutConstructor = null;
            } catch (InstantiationException unused2) {
                staticLayoutConstructor = null;
            } catch (InvocationTargetException unused3) {
                staticLayoutConstructor = null;
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(p0.getText(), p0.getStart(), p0.getEnd(), p0.getPaint(), p0.getWidth(), p0.getAlignment(), p0.getLineSpacingMultiplier(), p0.getLineSpacingExtra(), p0.getIncludePadding(), p0.getEllipsize(), p0.getEllipsizedWidth());
    }
}
