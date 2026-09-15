package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "p0", "", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "consume", "deadKeyCode", "Ljava/lang/Integer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    private Integer deadKeyCode;

    /* JADX INFO: renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m1316consumeZmokQxo(KeyEvent p0) {
        int iM5366getUtf16CodePointZmokQxo = KeyEvent_androidKt.m5366getUtf16CodePointZmokQxo(p0);
        if ((Integer.MIN_VALUE & iM5366getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(iM5366getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num != null) {
            this.deadKeyCode = null;
            Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM5366getUtf16CodePointZmokQxo));
            Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
            return num2 == null ? Integer.valueOf(iM5366getUtf16CodePointZmokQxo) : num2;
        }
        return Integer.valueOf(iM5366getUtf16CodePointZmokQxo);
    }
}
