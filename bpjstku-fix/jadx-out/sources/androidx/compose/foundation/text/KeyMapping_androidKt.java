package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/KeyMapping;", "platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* JADX INFO: renamed from: map-ZmokQxo */
        public final KeyCommand mo1318mapZmokQxo(KeyEvent p0) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m5370isShiftPressedZmokQxo(p0) && KeyEvent_androidKt.m5367isAltPressedZmokQxo(p0)) {
                long jM5364getKeyZmokQxo = KeyEvent_androidKt.m5364getKeyZmokQxo(p0);
                if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, MappedKeys.INSTANCE.m1357getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, MappedKeys.INSTANCE.m1358getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, MappedKeys.INSTANCE.m1359getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo, MappedKeys.INSTANCE.m1356getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m5367isAltPressedZmokQxo(p0)) {
                long jM5364getKeyZmokQxo2 = KeyEvent_androidKt.m5364getKeyZmokQxo(p0);
                if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo2, MappedKeys.INSTANCE.m1357getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo2, MappedKeys.INSTANCE.m1358getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo2, MappedKeys.INSTANCE.m1359getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m5056equalsimpl0(jM5364getKeyZmokQxo2, MappedKeys.INSTANCE.m1356getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo1318mapZmokQxo(p0) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
