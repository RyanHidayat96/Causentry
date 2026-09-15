package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes4.dex */
public final class setVolumeTo extends Paint {
    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public setVolumeTo() {
    }

    public setVolumeTo(int i) {
        super(i);
    }

    public setVolumeTo(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public setVolumeTo(PorterDuff.Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
