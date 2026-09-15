package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import org.jetbrains.anko.AnkoException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u001c\u0010\f\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"LgetIncrementalScaleFactor;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Ljava/lang/Class;", "Landroid/app/Activity;", "p1", "", "Lkotlin/Pair;", "", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/Class;[Lkotlin/Pair;)V"}, k = 1, mv = {2, 3, 0})
public final class getIncrementalScaleFactor {
    public static final getIncrementalScaleFactor INSTANCE = new getIncrementalScaleFactor();

    private getIncrementalScaleFactor() {
    }

    @JvmStatic
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, Class<? extends Activity> p1, Pair<String, ? extends Object>[] p2) {
        Intent intent = new Intent(p0, p1);
        if (p2.length != 0) {
            for (Pair<String, ? extends Object> pair : p2) {
                Object second = pair.getSecond();
                if (second == null) {
                    intent.putExtra(pair.getFirst(), (Serializable) null);
                } else if (second instanceof Integer) {
                    intent.putExtra(pair.getFirst(), ((Number) second).intValue());
                } else if (second instanceof Long) {
                    intent.putExtra(pair.getFirst(), ((Number) second).longValue());
                } else if (second instanceof CharSequence) {
                    intent.putExtra(pair.getFirst(), (CharSequence) second);
                } else if (second instanceof String) {
                    intent.putExtra(pair.getFirst(), (String) second);
                } else if (second instanceof Float) {
                    intent.putExtra(pair.getFirst(), ((Number) second).floatValue());
                } else if (second instanceof Double) {
                    intent.putExtra(pair.getFirst(), ((Number) second).doubleValue());
                } else if (second instanceof Character) {
                    intent.putExtra(pair.getFirst(), ((Character) second).charValue());
                } else if (second instanceof Short) {
                    intent.putExtra(pair.getFirst(), ((Number) second).shortValue());
                } else if (second instanceof Boolean) {
                    intent.putExtra(pair.getFirst(), ((Boolean) second).booleanValue());
                } else if (second instanceof Serializable) {
                    intent.putExtra(pair.getFirst(), (Serializable) second);
                } else if (second instanceof Bundle) {
                    intent.putExtra(pair.getFirst(), (Bundle) second);
                } else if (second instanceof Parcelable) {
                    intent.putExtra(pair.getFirst(), (Parcelable) second);
                } else if (second instanceof Object[]) {
                    Object[] objArr = (Object[]) second;
                    if (objArr instanceof CharSequence[]) {
                        intent.putExtra(pair.getFirst(), (Serializable) second);
                    } else if (objArr instanceof String[]) {
                        intent.putExtra(pair.getFirst(), (Serializable) second);
                    } else {
                        if (!(objArr instanceof Parcelable[])) {
                            StringBuilder sb = new StringBuilder("Intent extra ");
                            sb.append(pair.getFirst());
                            sb.append(" has wrong type ");
                            sb.append(objArr.getClass().getName());
                            throw new AnkoException(sb.toString());
                        }
                        intent.putExtra(pair.getFirst(), (Serializable) second);
                    }
                } else if (second instanceof int[]) {
                    intent.putExtra(pair.getFirst(), (int[]) second);
                } else if (second instanceof long[]) {
                    intent.putExtra(pair.getFirst(), (long[]) second);
                } else if (second instanceof float[]) {
                    intent.putExtra(pair.getFirst(), (float[]) second);
                } else if (second instanceof double[]) {
                    intent.putExtra(pair.getFirst(), (double[]) second);
                } else if (second instanceof char[]) {
                    intent.putExtra(pair.getFirst(), (char[]) second);
                } else if (second instanceof short[]) {
                    intent.putExtra(pair.getFirst(), (short[]) second);
                } else {
                    if (!(second instanceof boolean[])) {
                        StringBuilder sb2 = new StringBuilder("Intent extra ");
                        sb2.append(pair.getFirst());
                        sb2.append(" has wrong type ");
                        sb2.append(second.getClass().getName());
                        throw new AnkoException(sb2.toString());
                    }
                    intent.putExtra(pair.getFirst(), (boolean[]) second);
                }
            }
        }
        p0.startActivity(intent);
    }
}
