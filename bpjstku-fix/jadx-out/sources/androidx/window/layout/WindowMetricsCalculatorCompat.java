package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "(Landroid/app/Activity;)Landroidx/window/layout/WindowMetrics;", "computeMaximumWindowMetrics", "Landroid/graphics/Rect;", "computeWindowBoundsIceCreamSandwich$window_release", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "computeWindowBoundsN$window_release", "computeWindowBoundsP$window_release", "computeWindowBoundsQ$window_release", "Landroid/view/Display;", "Landroid/view/DisplayCutout;", "getCutoutForDisplay", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "Landroid/content/Context;", "", "getNavigationBarHeight", "(Landroid/content/Context;)I", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "(Landroid/view/Display;)Landroid/graphics/Point;", "p1", "", "getRectSizeFromDisplay", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "", "TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG;

    private WindowMetricsCalculatorCompat() {
    }

    static {
        Intrinsics.checkNotNullExpressionValue("WindowMetricsCalculatorCompat", "");
        TAG = "WindowMetricsCalculatorCompat";
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public final WindowMetrics computeCurrentWindowMetrics(Activity p0) {
        Rect rectComputeWindowBoundsN$window_release;
        Intrinsics.checkNotNullParameter(p0, "");
        if (Build.VERSION.SDK_INT >= 30) {
            rectComputeWindowBoundsN$window_release = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(p0);
        } else if (Build.VERSION.SDK_INT >= 29) {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsQ$window_release(p0);
        } else if (Build.VERSION.SDK_INT >= 28) {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsP$window_release(p0);
        } else {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsN$window_release(p0);
        }
        return new WindowMetrics(rectComputeWindowBoundsN$window_release);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public final WindowMetrics computeMaximumWindowMetrics(Activity p0) {
        Rect rect;
        Intrinsics.checkNotNullParameter(p0, "");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(p0);
        } else {
            Display defaultDisplay = p0.getWindowManager().getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    public final Rect computeWindowBoundsQ$window_release(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Configuration configuration = p0.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e2) {
            return computeWindowBoundsP$window_release(p0);
        } catch (NoSuchFieldException e3) {
            return computeWindowBoundsP$window_release(p0);
        } catch (NoSuchMethodException e4) {
            return computeWindowBoundsP$window_release(p0);
        } catch (InvocationTargetException e5) {
            return computeWindowBoundsP$window_release(p0);
        }
    }

    public final Rect computeWindowBoundsP$window_release(Activity p0) {
        DisplayCutout cutoutForDisplay;
        Intrinsics.checkNotNullParameter(p0, "");
        Rect rect = new Rect();
        Configuration configuration = p0.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e2) {
            getRectSizeFromDisplay(p0, rect);
        } catch (NoSuchFieldException e3) {
            getRectSizeFromDisplay(p0, rect);
        } catch (NoSuchMethodException e4) {
            getRectSizeFromDisplay(p0, rect);
        } catch (InvocationTargetException e5) {
            getRectSizeFromDisplay(p0, rect);
        }
        Display defaultDisplay = p0.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "");
        displayCompatHelperApi17.getRealSize(defaultDisplay, point);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0)) {
            int navigationBarHeight = getNavigationBarHeight(p0);
            if (rect.bottom + navigationBarHeight == point.y) {
                rect.bottom += navigationBarHeight;
            } else if (rect.right + navigationBarHeight == point.x) {
                rect.right += navigationBarHeight;
            } else if (rect.left == navigationBarHeight) {
                rect.left = 0;
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0) && (cutoutForDisplay = getCutoutForDisplay(defaultDisplay)) != null) {
            if (rect.left == DisplayCompatHelperApi28.INSTANCE.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay)) {
                rect.right += DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay);
            }
            if (rect.top == DisplayCompatHelperApi28.INSTANCE.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom += DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect;
    }

    private final void getRectSizeFromDisplay(Activity p0, Rect p1) {
        p0.getWindowManager().getDefaultDisplay().getRectSize(p1);
    }

    public final Rect computeWindowBoundsN$window_release(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Rect rect = new Rect();
        Display defaultDisplay = p0.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(p0)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(p0);
            if (rect.bottom + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom += navigationBarHeight;
                return rect;
            }
            if (rect.right + navigationBarHeight == realSizeForDisplay$window_release.x) {
                rect.right += navigationBarHeight;
            }
        }
        return rect;
    }

    public final Rect computeWindowBoundsIceCreamSandwich$window_release(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Display defaultDisplay = p0.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        if (realSizeForDisplay$window_release.x == 0 || realSizeForDisplay$window_release.y == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = realSizeForDisplay$window_release.x;
        rect.bottom = realSizeForDisplay$window_release.y;
        return rect;
    }

    public final Point getRealSizeForDisplay$window_release(Display p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(p0, point);
        return point;
    }

    private final int getNavigationBarHeight(Context p0) {
        Resources resources = p0.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final DisplayCutout getCutoutForDisplay(Display p0) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = p0.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(p0, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (ClassNotFoundException e2) {
            return null;
        } catch (IllegalAccessException e3) {
            return null;
        } catch (InstantiationException e4) {
            return null;
        } catch (NoSuchFieldException e5) {
            return null;
        } catch (NoSuchMethodException e6) {
            return null;
        } catch (InvocationTargetException e7) {
            return null;
        }
    }
}
