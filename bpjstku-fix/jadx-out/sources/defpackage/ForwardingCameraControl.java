package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.zxing.DecodeHintType;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class ForwardingCameraControl {
    static {
        Pattern.compile(",");
    }

    public static Map<DecodeHintType, Object> b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (decodeHintType != DecodeHintType.CHARACTER_SET && decodeHintType != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodeHintType != DecodeHintType.POSSIBLE_FORMATS) {
                String strName = decodeHintType.name();
                if (extras.containsKey(strName)) {
                    if (decodeHintType.valueType.equals(Void.class)) {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    } else {
                        Object obj = extras.get(strName);
                        if (decodeHintType.valueType.isInstance(obj)) {
                            enumMap.put(decodeHintType, obj);
                        } else {
                            Objects.toString(decodeHintType);
                            Objects.toString(obj);
                        }
                    }
                }
            }
        }
        enumMap.toString();
        return enumMap;
    }
}
