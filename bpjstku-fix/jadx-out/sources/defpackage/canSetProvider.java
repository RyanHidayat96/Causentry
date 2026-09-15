package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public interface canSetProvider {
    public static final canSetProvider TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new canSetProvider() { // from class: canSetProvider.4
        @Override // defpackage.canSetProvider
        public final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resources resources, Bitmap bitmap) throws IllegalAccessException {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 41, View.getDefaultSize(0, 0) + 19, 1513912262, false, "b", null);
            }
            int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.rgb(0, 0, 0) + 16777275, TextUtils.lastIndexOf("", '0') + 19, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            long j = i2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37837 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 60, 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = 399;
            long j3 = (j2 * 1985102256565825758L) + (j2 * 3534151240593960481L);
            long j4 = 398;
            long j5 = -1;
            long j6 = ((j5 ^ 1985102256565825758L) | 3534151240593960481L) ^ j5;
            long j7 = j5 ^ 3534151240593960481L;
            long j8 = (j7 | 1985102256565825758L) ^ j5;
            long jIdentityHashCode = System.identityHashCode(this);
            long j9 = j3 + ((j6 | j8 | ((j7 | jIdentityHashCode) ^ j5)) * j4) + (((long) (-1194)) * 4291930428232695551L) + (j4 * ((j5 ^ (j7 | (jIdentityHashCode ^ j5))) | j6 | j8));
            long j10 = j;
            int i4 = 0;
            while (true) {
                for (int i5 = 0; i5 != 8; i5++) {
                    i3 = (((((int) (j10 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                }
                if (i4 != 0) {
                    break;
                }
                i4++;
                j10 = j9;
            }
            if (i3 != i) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - ((byte) KeyEvent.getModifierMetaStateMask())), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, TextUtils.getOffsetAfter("", 0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw new RuntimeException(String.valueOf(i2));
            }
            return new BitmapDrawable(resources, bitmap);
        }
    };

    Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resources resources, Bitmap bitmap);
}
