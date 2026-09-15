package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.messaging.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bQ\b\u0007\u0018\u00002\u00020\u0001Bñ\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b \u0010)J´\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+Jú\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101R\u001d\u00102\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010L\u001a\u0004\u0018\u00010K8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010S\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u0004\u0018\u00010T8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010\\\u001a\u0004\u0018\u00010[8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\\\u0010]\u0012\u0004\bb\u0010S\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010c\u001a\u0004\u0018\u0001068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bc\u00108\u001a\u0004\bd\u0010:\"\u0004\be\u0010<R$\u0010f\u001a\u0004\u0018\u00010=8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bf\u0010?\u001a\u0004\bg\u0010A\"\u0004\bh\u0010CR$\u0010i\u001a\u0004\u0018\u00010D8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bi\u0010F\u001a\u0004\bj\u0010H\"\u0004\bk\u0010JR$\u0010m\u001a\u0004\u0018\u00010l8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010s\u001a\u0004\u0018\u0001068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bs\u00108\u001a\u0004\bt\u0010:\"\u0004\bu\u0010<R$\u0010v\u001a\u0004\u0018\u00010=8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bv\u0010?\u001a\u0004\bw\u0010A\"\u0004\bx\u0010CR$\u0010y\u001a\u0004\u0018\u00010l8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\by\u0010n\u001a\u0004\bz\u0010p\"\u0004\b{\u0010rR'\u0010}\u001a\u0004\u0018\u00010|8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010l8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010n\u001a\u0005\b\u0084\u0001\u0010p\"\u0005\b\u0085\u0001\u0010rR/\u0010\u0086\u0001\u001a\u0004\u0018\u00010K8\u0001@\u0001X\u0080\u000e¢\u0006\u001c\n\u0005\b\u0086\u0001\u0010M\u0012\u0005\b\u0089\u0001\u0010S\u001a\u0005\b\u0087\u0001\u0010O\"\u0005\b\u0088\u0001\u0010QR/\u0010\u008a\u0001\u001a\u0004\u0018\u00010K8\u0001@\u0001X\u0080\u000e¢\u0006\u001c\n\u0005\b\u008a\u0001\u0010M\u0012\u0005\b\u008d\u0001\u0010S\u001a\u0005\b\u008b\u0001\u0010O\"\u0005\b\u008c\u0001\u0010QR,\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R,\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R(\u0010£\u0001\u001a\u0004\u0018\u00010=8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010?\u001a\u0005\b¤\u0001\u0010A\"\u0005\b¥\u0001\u0010CR(\u0010¦\u0001\u001a\u0004\u0018\u00010D8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010F\u001a\u0005\b§\u0001\u0010H\"\u0005\b¨\u0001\u0010JR,\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R,\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R3\u0010¸\u0001\u001a\u0005\u0018\u00010·\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u001f\n\u0006\b¸\u0001\u0010¹\u0001\u0012\u0005\b¾\u0001\u0010S\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R3\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u001f\n\u0006\bÀ\u0001\u0010Á\u0001\u0012\u0005\bÆ\u0001\u0010S\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R,\u0010È\u0001\u001a\u0005\u0018\u00010Ç\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R(\u0010Î\u0001\u001a\u0004\u0018\u0001068\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\bÎ\u0001\u00108\u001a\u0005\bÏ\u0001\u0010:\"\u0005\bÐ\u0001\u0010<R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R(\u0010Ø\u0001\u001a\u0004\u0018\u00010=8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\bØ\u0001\u0010?\u001a\u0005\bÙ\u0001\u0010A\"\u0005\bÚ\u0001\u0010CR,\u0010Û\u0001\u001a\u0005\u0018\u00010©\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010«\u0001\u001a\u0006\bÜ\u0001\u0010\u00ad\u0001\"\u0006\bÝ\u0001\u0010¯\u0001R3\u0010ß\u0001\u001a\u0005\u0018\u00010Þ\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u001f\n\u0006\bß\u0001\u0010à\u0001\u0012\u0005\bå\u0001\u0010S\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R/\u0010æ\u0001\u001a\u0004\u0018\u00010K8\u0001@\u0001X\u0080\u000e¢\u0006\u001c\n\u0005\bæ\u0001\u0010M\u0012\u0005\bé\u0001\u0010S\u001a\u0005\bç\u0001\u0010O\"\u0005\bè\u0001\u0010QR \u0010ê\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bê\u0001\u00103\u001a\u0005\bë\u0001\u00105R \u0010ì\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bì\u0001\u00103\u001a\u0005\bí\u0001\u00105R \u0010î\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bî\u0001\u00103\u001a\u0005\bï\u0001\u00105R \u0010ð\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bð\u0001\u00103\u001a\u0005\bñ\u0001\u00105R \u0010ò\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bò\u0001\u00103\u001a\u0005\bó\u0001\u00105R \u0010ô\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bô\u0001\u00103\u001a\u0005\bõ\u0001\u00105R \u0010ö\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bö\u0001\u00103\u001a\u0005\b÷\u0001\u00105R \u0010ø\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bø\u0001\u00103\u001a\u0005\bù\u0001\u00105R \u0010ú\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bú\u0001\u00103\u001a\u0005\bû\u0001\u00105R \u0010ü\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bü\u0001\u00103\u001a\u0005\bý\u0001\u00105R \u0010þ\u0001\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bþ\u0001\u00103\u001a\u0005\bÿ\u0001\u00105R \u0010\u0080\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0080\u0002\u00103\u001a\u0005\b\u0081\u0002\u00105R \u0010\u0082\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0082\u0002\u00103\u001a\u0005\b\u0083\u0002\u00105R \u0010\u0084\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0084\u0002\u00103\u001a\u0005\b\u0085\u0002\u00105R \u0010\u0086\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0086\u0002\u00103\u001a\u0005\b\u0087\u0002\u00105R \u0010\u0088\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0088\u0002\u00103\u001a\u0005\b\u0089\u0002\u00105R \u0010\u008a\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008a\u0002\u00103\u001a\u0005\b\u008b\u0002\u00105R \u0010\u008c\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008c\u0002\u00103\u001a\u0005\b\u008d\u0002\u00105R \u0010\u008e\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008e\u0002\u00103\u001a\u0005\b\u008f\u0002\u00105R \u0010\u0090\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0090\u0002\u00103\u001a\u0005\b\u0091\u0002\u00105R \u0010\u0092\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0092\u0002\u00103\u001a\u0005\b\u0093\u0002\u00105R \u0010\u0094\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0094\u0002\u00103\u001a\u0005\b\u0095\u0002\u00105R \u0010\u0096\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0096\u0002\u00103\u001a\u0005\b\u0097\u0002\u00105R \u0010\u0098\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0098\u0002\u00103\u001a\u0005\b\u0099\u0002\u00105R \u0010\u009a\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009a\u0002\u00103\u001a\u0005\b\u009b\u0002\u00105R \u0010\u009c\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009c\u0002\u00103\u001a\u0005\b\u009d\u0002\u00105R \u0010\u009e\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009e\u0002\u00103\u001a\u0005\b\u009f\u0002\u00105R \u0010 \u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b \u0002\u00103\u001a\u0005\b¡\u0002\u00105R \u0010¢\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b¢\u0002\u00103\u001a\u0005\b£\u0002\u00105R \u0010¤\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b¤\u0002\u00103\u001a\u0005\b¥\u0002\u00105R \u0010¦\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b¦\u0002\u00103\u001a\u0005\b§\u0002\u00105R \u0010¨\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b¨\u0002\u00103\u001a\u0005\b©\u0002\u00105R \u0010ª\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\bª\u0002\u00103\u001a\u0005\b«\u0002\u00105R \u0010¬\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b¬\u0002\u00103\u001a\u0005\b\u00ad\u0002\u00105R \u0010®\u0002\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u000e\n\u0005\b®\u0002\u00103\u001a\u0005\b¯\u0002\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy", "copy-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "", "toString", "()Ljava/lang/String;", "background", "J", "getBackground-0d7_KjU", "()J", "Landroidx/compose/material3/ChipColors;", "defaultAssistChipColorsCached", "Landroidx/compose/material3/ChipColors;", "getDefaultAssistChipColorsCached$material3_release", "()Landroidx/compose/material3/ChipColors;", "setDefaultAssistChipColorsCached$material3_release", "(Landroidx/compose/material3/ChipColors;)V", "Landroidx/compose/material3/ButtonColors;", "defaultButtonColorsCached", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3_release", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3_release", "(Landroidx/compose/material3/ButtonColors;)V", "Landroidx/compose/material3/CardColors;", "defaultCardColorsCached", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3_release", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3_release", "(Landroidx/compose/material3/CardColors;)V", "Landroidx/compose/material3/TopAppBarColors;", "defaultCenterAlignedTopAppBarColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release", "()Landroidx/compose/material3/TopAppBarColors;", "setDefaultCenterAlignedTopAppBarColorsCached$material3_release", "(Landroidx/compose/material3/TopAppBarColors;)V", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "()V", "Landroidx/compose/material3/CheckboxColors;", "defaultCheckboxColorsCached", "Landroidx/compose/material3/CheckboxColors;", "getDefaultCheckboxColorsCached$material3_release", "()Landroidx/compose/material3/CheckboxColors;", "setDefaultCheckboxColorsCached$material3_release", "(Landroidx/compose/material3/CheckboxColors;)V", "Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColorsCached", "Landroidx/compose/material3/DatePickerColors;", "getDefaultDatePickerColorsCached$material3_release", "()Landroidx/compose/material3/DatePickerColors;", "setDefaultDatePickerColorsCached$material3_release", "(Landroidx/compose/material3/DatePickerColors;)V", "getDefaultDatePickerColorsCached$material3_release$annotations", "defaultElevatedAssistChipColorsCached", "getDefaultElevatedAssistChipColorsCached$material3_release", "setDefaultElevatedAssistChipColorsCached$material3_release", "defaultElevatedButtonColorsCached", "getDefaultElevatedButtonColorsCached$material3_release", "setDefaultElevatedButtonColorsCached$material3_release", "defaultElevatedCardColorsCached", "getDefaultElevatedCardColorsCached$material3_release", "setDefaultElevatedCardColorsCached$material3_release", "Landroidx/compose/material3/SelectableChipColors;", "defaultElevatedFilterChipColorsCached", "Landroidx/compose/material3/SelectableChipColors;", "getDefaultElevatedFilterChipColorsCached$material3_release", "()Landroidx/compose/material3/SelectableChipColors;", "setDefaultElevatedFilterChipColorsCached$material3_release", "(Landroidx/compose/material3/SelectableChipColors;)V", "defaultElevatedSuggestionChipColorsCached", "getDefaultElevatedSuggestionChipColorsCached$material3_release", "setDefaultElevatedSuggestionChipColorsCached$material3_release", "defaultFilledTonalButtonColorsCached", "getDefaultFilledTonalButtonColorsCached$material3_release", "setDefaultFilledTonalButtonColorsCached$material3_release", "defaultFilterChipColorsCached", "getDefaultFilterChipColorsCached$material3_release", "setDefaultFilterChipColorsCached$material3_release", "Landroidx/compose/material3/IconButtonColors;", "defaultIconButtonColorsCached", "Landroidx/compose/material3/IconButtonColors;", "getDefaultIconButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconButtonColors;", "setDefaultIconButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconButtonColors;)V", "defaultInputChipColorsCached", "getDefaultInputChipColorsCached$material3_release", "setDefaultInputChipColorsCached$material3_release", "defaultLargeTopAppBarColorsCached", "getDefaultLargeTopAppBarColorsCached$material3_release", "setDefaultLargeTopAppBarColorsCached$material3_release", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "defaultMediumTopAppBarColorsCached", "getDefaultMediumTopAppBarColorsCached$material3_release", "setDefaultMediumTopAppBarColorsCached$material3_release", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "Landroidx/compose/material3/MenuItemColors;", "defaultMenuItemColorsCached", "Landroidx/compose/material3/MenuItemColors;", "getDefaultMenuItemColorsCached$material3_release", "()Landroidx/compose/material3/MenuItemColors;", "setDefaultMenuItemColorsCached$material3_release", "(Landroidx/compose/material3/MenuItemColors;)V", "Landroidx/compose/material3/NavigationBarItemColors;", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "getDefaultNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationBarItemColors;", "setDefaultNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "Landroidx/compose/material3/NavigationRailItemColors;", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/NavigationRailItemColors;", "getDefaultNavigationRailItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationRailItemColors;", "setDefaultNavigationRailItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationRailItemColors;)V", "defaultOutlinedButtonColorsCached", "getDefaultOutlinedButtonColorsCached$material3_release", "setDefaultOutlinedButtonColorsCached$material3_release", "defaultOutlinedCardColorsCached", "getDefaultOutlinedCardColorsCached$material3_release", "setDefaultOutlinedCardColorsCached$material3_release", "Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColorsCached", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3_release", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3_release", "(Landroidx/compose/material3/TextFieldColors;)V", "Landroidx/compose/material3/RadioButtonColors;", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "getDefaultRadioButtonColorsCached$material3_release", "()Landroidx/compose/material3/RadioButtonColors;", "setDefaultRadioButtonColorsCached$material3_release", "(Landroidx/compose/material3/RadioButtonColors;)V", "Landroidx/compose/material3/RichTooltipColors;", "defaultRichTooltipColorsCached", "Landroidx/compose/material3/RichTooltipColors;", "getDefaultRichTooltipColorsCached$material3_release", "()Landroidx/compose/material3/RichTooltipColors;", "setDefaultRichTooltipColorsCached$material3_release", "(Landroidx/compose/material3/RichTooltipColors;)V", "getDefaultRichTooltipColorsCached$material3_release$annotations", "Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/SegmentedButtonColors;", "getDefaultSegmentedButtonColorsCached$material3_release", "()Landroidx/compose/material3/SegmentedButtonColors;", "setDefaultSegmentedButtonColorsCached$material3_release", "(Landroidx/compose/material3/SegmentedButtonColors;)V", "getDefaultSegmentedButtonColorsCached$material3_release$annotations", "Landroidx/compose/material3/SliderColors;", "defaultSliderColorsCached", "Landroidx/compose/material3/SliderColors;", "getDefaultSliderColorsCached$material3_release", "()Landroidx/compose/material3/SliderColors;", "setDefaultSliderColorsCached$material3_release", "(Landroidx/compose/material3/SliderColors;)V", "defaultSuggestionChipColorsCached", "getDefaultSuggestionChipColorsCached$material3_release", "setDefaultSuggestionChipColorsCached$material3_release", "Landroidx/compose/material3/SwitchColors;", "defaultSwitchColorsCached", "Landroidx/compose/material3/SwitchColors;", "getDefaultSwitchColorsCached$material3_release", "()Landroidx/compose/material3/SwitchColors;", "setDefaultSwitchColorsCached$material3_release", "(Landroidx/compose/material3/SwitchColors;)V", "defaultTextButtonColorsCached", "getDefaultTextButtonColorsCached$material3_release", "setDefaultTextButtonColorsCached$material3_release", "defaultTextFieldColorsCached", "getDefaultTextFieldColorsCached$material3_release", "setDefaultTextFieldColorsCached$material3_release", "Landroidx/compose/material3/TimePickerColors;", "defaultTimePickerColorsCached", "Landroidx/compose/material3/TimePickerColors;", "getDefaultTimePickerColorsCached$material3_release", "()Landroidx/compose/material3/TimePickerColors;", "setDefaultTimePickerColorsCached$material3_release", "(Landroidx/compose/material3/TimePickerColors;)V", "getDefaultTimePickerColorsCached$material3_release$annotations", "defaultTopAppBarColorsCached", "getDefaultTopAppBarColorsCached$material3_release", "setDefaultTopAppBarColorsCached$material3_release", "getDefaultTopAppBarColorsCached$material3_release$annotations", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError-0d7_KjU", "errorContainer", "getErrorContainer-0d7_KjU", "inverseOnSurface", "getInverseOnSurface-0d7_KjU", "inversePrimary", "getInversePrimary-0d7_KjU", "inverseSurface", "getInverseSurface-0d7_KjU", "onBackground", "getOnBackground-0d7_KjU", "onError", "getOnError-0d7_KjU", "onErrorContainer", "getOnErrorContainer-0d7_KjU", "onPrimary", "getOnPrimary-0d7_KjU", "onPrimaryContainer", "getOnPrimaryContainer-0d7_KjU", "onSecondary", "getOnSecondary-0d7_KjU", "onSecondaryContainer", "getOnSecondaryContainer-0d7_KjU", "onSurface", "getOnSurface-0d7_KjU", "onSurfaceVariant", "getOnSurfaceVariant-0d7_KjU", "onTertiary", "getOnTertiary-0d7_KjU", "onTertiaryContainer", "getOnTertiaryContainer-0d7_KjU", "outline", "getOutline-0d7_KjU", "outlineVariant", "getOutlineVariant-0d7_KjU", "primary", "getPrimary-0d7_KjU", "primaryContainer", "getPrimaryContainer-0d7_KjU", "scrim", "getScrim-0d7_KjU", "secondary", "getSecondary-0d7_KjU", "secondaryContainer", "getSecondaryContainer-0d7_KjU", "surface", "getSurface-0d7_KjU", "surfaceBright", "getSurfaceBright-0d7_KjU", "surfaceContainer", "getSurfaceContainer-0d7_KjU", "surfaceContainerHigh", "getSurfaceContainerHigh-0d7_KjU", "surfaceContainerHighest", "getSurfaceContainerHighest-0d7_KjU", "surfaceContainerLow", "getSurfaceContainerLow-0d7_KjU", "surfaceContainerLowest", "getSurfaceContainerLowest-0d7_KjU", "surfaceDim", "getSurfaceDim-0d7_KjU", "surfaceTint", "getSurfaceTint-0d7_KjU", "surfaceVariant", "getSurfaceVariant-0d7_KjU", "tertiary", "getTertiary-0d7_KjU", "tertiaryContainer", "getTertiaryContainer-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;
    private ChipColors defaultAssistChipColorsCached;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;
    private CheckboxColors defaultCheckboxColorsCached;
    private DatePickerColors defaultDatePickerColorsCached;
    private ChipColors defaultElevatedAssistChipColorsCached;
    private ButtonColors defaultElevatedButtonColorsCached;
    private CardColors defaultElevatedCardColorsCached;
    private SelectableChipColors defaultElevatedFilterChipColorsCached;
    private ChipColors defaultElevatedSuggestionChipColorsCached;
    private ButtonColors defaultFilledTonalButtonColorsCached;
    private SelectableChipColors defaultFilterChipColorsCached;
    private IconButtonColors defaultIconButtonColorsCached;
    private SelectableChipColors defaultInputChipColorsCached;
    private TopAppBarColors defaultLargeTopAppBarColorsCached;
    private TopAppBarColors defaultMediumTopAppBarColorsCached;
    private MenuItemColors defaultMenuItemColorsCached;
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;
    private ButtonColors defaultOutlinedButtonColorsCached;
    private CardColors defaultOutlinedCardColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private RadioButtonColors defaultRadioButtonColorsCached;
    private RichTooltipColors defaultRichTooltipColorsCached;
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;
    private SliderColors defaultSliderColorsCached;
    private ChipColors defaultSuggestionChipColorsCached;
    private SwitchColors defaultSwitchColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private TextFieldColors defaultTextFieldColorsCached;
    private TimePickerColors defaultTimePickerColorsCached;
    private TopAppBarColors defaultTopAppBarColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;

    public static /* synthetic */ void getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultLargeTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultMediumTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultSegmentedButtonColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3_release$annotations() {
    }

    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        this.primary = j;
        this.onPrimary = j2;
        this.primaryContainer = j3;
        this.onPrimaryContainer = j4;
        this.inversePrimary = j5;
        this.secondary = j6;
        this.onSecondary = j7;
        this.secondaryContainer = j8;
        this.onSecondaryContainer = j9;
        this.tertiary = j10;
        this.onTertiary = j11;
        this.tertiaryContainer = j12;
        this.onTertiaryContainer = j13;
        this.background = j14;
        this.onBackground = j15;
        this.surface = j16;
        this.onSurface = j17;
        this.surfaceVariant = j18;
        this.onSurfaceVariant = j19;
        this.surfaceTint = j20;
        this.inverseSurface = j21;
        this.inverseOnSurface = j22;
        this.error = j23;
        this.onError = j24;
        this.errorContainer = j25;
        this.onErrorContainer = j26;
        this.outline = j27;
        this.outlineVariant = j28;
        this.scrim = j29;
        this.surfaceBright = j30;
        this.surfaceDim = j31;
        this.surfaceContainer = j32;
        this.surfaceContainerHigh = j33;
        this.surfaceContainerHighest = j34;
        this.surfaceContainerLow = j35;
        this.surfaceContainerLowest = j36;
    }

    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* JADX INFO: renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* JADX INFO: renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* JADX INFO: renamed from: getInversePrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* JADX INFO: renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* JADX INFO: renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* JADX INFO: renamed from: getTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* JADX INFO: renamed from: getOnTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* JADX INFO: renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    /* JADX INFO: renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* JADX INFO: renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* JADX INFO: renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* JADX INFO: renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* JADX INFO: renamed from: getInverseSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* JADX INFO: renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
    public final long getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* JADX INFO: renamed from: getErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* JADX INFO: renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* JADX INFO: renamed from: getOutline-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* JADX INFO: renamed from: getScrim-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrim() {
        return this.scrim;
    }

    /* JADX INFO: renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* JADX INFO: renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* JADX INFO: renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* JADX INFO: renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* JADX INFO: renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* JADX INFO: renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* JADX INFO: renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, Color.INSTANCE.m4254getUnspecified0d7_KjU(), Color.INSTANCE.m4254getUnspecified0d7_KjU(), Color.INSTANCE.m4254getUnspecified0d7_KjU(), Color.INSTANCE.m4254getUnspecified0d7_KjU(), Color.INSTANCE.m4254getUnspecified0d7_KjU(), Color.INSTANCE.m4254getUnspecified0d7_KjU(), Color.INSTANCE.m4254getUnspecified0d7_KjU(), null);
    }

    /* JADX INFO: renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1881copyCXl9yA$default(ColorScheme colorScheme, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        return colorScheme.m1883copyCXl9yA((i & 1) != 0 ? colorScheme.primary : j, (i & 2) != 0 ? colorScheme.onPrimary : j2, (i & 4) != 0 ? colorScheme.primaryContainer : j3, (i & 8) != 0 ? colorScheme.onPrimaryContainer : j4, (i & 16) != 0 ? colorScheme.inversePrimary : j5, (i & 32) != 0 ? colorScheme.secondary : j6, (i & 64) != 0 ? colorScheme.onSecondary : j7, (i & 128) != 0 ? colorScheme.secondaryContainer : j8, (i & 256) != 0 ? colorScheme.onSecondaryContainer : j9, (i & 512) != 0 ? colorScheme.tertiary : j10, (i & 1024) != 0 ? colorScheme.onTertiary : j11, (i & 2048) != 0 ? colorScheme.tertiaryContainer : j12, (i & 4096) != 0 ? colorScheme.onTertiaryContainer : j13, (i & 8192) != 0 ? colorScheme.background : j14, (i & 16384) != 0 ? colorScheme.onBackground : j15, (i & 32768) != 0 ? colorScheme.surface : j16, (i & 65536) != 0 ? colorScheme.onSurface : j17, (i & 131072) != 0 ? colorScheme.surfaceVariant : j18, (i & 262144) != 0 ? colorScheme.onSurfaceVariant : j19, (i & 524288) != 0 ? colorScheme.surfaceTint : j20, (i & 1048576) != 0 ? colorScheme.inverseSurface : j21, (i & 2097152) != 0 ? colorScheme.inverseOnSurface : j22, (i & 4194304) != 0 ? colorScheme.error : j23, (i & 8388608) != 0 ? colorScheme.onError : j24, (i & 16777216) != 0 ? colorScheme.errorContainer : j25, (i & 33554432) != 0 ? colorScheme.onErrorContainer : j26, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? colorScheme.outline : j27, (i & 134217728) != 0 ? colorScheme.outlineVariant : j28, (i & 268435456) != 0 ? colorScheme.scrim : j29, (i & 536870912) != 0 ? colorScheme.surfaceBright : j30, (i & BasicMeasure.EXACTLY) != 0 ? colorScheme.surfaceDim : j31, (i & Integer.MIN_VALUE) != 0 ? colorScheme.surfaceContainer : j32, (i2 & 1) != 0 ? colorScheme.surfaceContainerHigh : j33, (i2 & 2) != 0 ? colorScheme.surfaceContainerHighest : j34, (i2 & 4) != 0 ? colorScheme.surfaceContainerLow : j35, (i2 & 8) != 0 ? colorScheme.surfaceContainerLowest : j36);
    }

    /* JADX INFO: renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final ColorScheme m1883copyCXl9yA(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12, long p13, long p14, long p15, long p16, long p17, long p18, long p19, long p20, long p21, long p22, long p23, long p24, long p25, long p26, long p27, long p28, long p29, long p30, long p31, long p32, long p33, long p34, long p35) {
        return new ColorScheme(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* JADX INFO: renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m1884copyG1PFcw(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12, long p13, long p14, long p15, long p16, long p17, long p18, long p19, long p20, long p21, long p22, long p23, long p24, long p25, long p26, long p27, long p28) {
        return m1881copyCXl9yA$default(this, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        sb.append((Object) Color.m4226toStringimpl(this.primary));
        sb.append("onPrimary=");
        sb.append((Object) Color.m4226toStringimpl(this.onPrimary));
        sb.append("primaryContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.primaryContainer));
        sb.append("onPrimaryContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.onPrimaryContainer));
        sb.append("inversePrimary=");
        sb.append((Object) Color.m4226toStringimpl(this.inversePrimary));
        sb.append("secondary=");
        sb.append((Object) Color.m4226toStringimpl(this.secondary));
        sb.append("onSecondary=");
        sb.append((Object) Color.m4226toStringimpl(this.onSecondary));
        sb.append("secondaryContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.secondaryContainer));
        sb.append("onSecondaryContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.onSecondaryContainer));
        sb.append("tertiary=");
        sb.append((Object) Color.m4226toStringimpl(this.tertiary));
        sb.append("onTertiary=");
        sb.append((Object) Color.m4226toStringimpl(this.onTertiary));
        sb.append("tertiaryContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.tertiaryContainer));
        sb.append("onTertiaryContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.onTertiaryContainer));
        sb.append("background=");
        sb.append((Object) Color.m4226toStringimpl(this.background));
        sb.append("onBackground=");
        sb.append((Object) Color.m4226toStringimpl(this.onBackground));
        sb.append("surface=");
        sb.append((Object) Color.m4226toStringimpl(this.surface));
        sb.append("onSurface=");
        sb.append((Object) Color.m4226toStringimpl(this.onSurface));
        sb.append("surfaceVariant=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceVariant));
        sb.append("onSurfaceVariant=");
        sb.append((Object) Color.m4226toStringimpl(this.onSurfaceVariant));
        sb.append("surfaceTint=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceTint));
        sb.append("inverseSurface=");
        sb.append((Object) Color.m4226toStringimpl(this.inverseSurface));
        sb.append("inverseOnSurface=");
        sb.append((Object) Color.m4226toStringimpl(this.inverseOnSurface));
        sb.append("error=");
        sb.append((Object) Color.m4226toStringimpl(this.error));
        sb.append("onError=");
        sb.append((Object) Color.m4226toStringimpl(this.onError));
        sb.append("errorContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.errorContainer));
        sb.append("onErrorContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.onErrorContainer));
        sb.append("outline=");
        sb.append((Object) Color.m4226toStringimpl(this.outline));
        sb.append("outlineVariant=");
        sb.append((Object) Color.m4226toStringimpl(this.outlineVariant));
        sb.append("scrim=");
        sb.append((Object) Color.m4226toStringimpl(this.scrim));
        sb.append("surfaceBright=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceBright));
        sb.append("surfaceDim=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceDim));
        sb.append("surfaceContainer=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceContainer));
        sb.append("surfaceContainerHigh=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceContainerHigh));
        sb.append("surfaceContainerHighest=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceContainerHighest));
        sb.append("surfaceContainerLow=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceContainerLow));
        sb.append("surfaceContainerLowest=");
        sb.append((Object) Color.m4226toStringimpl(this.surfaceContainerLowest));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: getDefaultButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    public final void setDefaultButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: getDefaultElevatedButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultElevatedButtonColorsCached() {
        return this.defaultElevatedButtonColorsCached;
    }

    public final void setDefaultElevatedButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: getDefaultFilledTonalButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultFilledTonalButtonColorsCached() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: getDefaultOutlinedButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultOutlinedButtonColorsCached() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: getDefaultTextButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    /* JADX INFO: renamed from: getDefaultCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    public final void setDefaultCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    /* JADX INFO: renamed from: getDefaultElevatedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultElevatedCardColorsCached() {
        return this.defaultElevatedCardColorsCached;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    /* JADX INFO: renamed from: getDefaultOutlinedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultOutlinedCardColorsCached() {
        return this.defaultOutlinedCardColorsCached;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    /* JADX INFO: renamed from: getDefaultAssistChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultAssistChipColorsCached() {
        return this.defaultAssistChipColorsCached;
    }

    public final void setDefaultAssistChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    /* JADX INFO: renamed from: getDefaultElevatedAssistChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultElevatedAssistChipColorsCached() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    /* JADX INFO: renamed from: getDefaultSuggestionChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultSuggestionChipColorsCached() {
        return this.defaultSuggestionChipColorsCached;
    }

    public final void setDefaultSuggestionChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    /* JADX INFO: renamed from: getDefaultElevatedSuggestionChipColorsCached$material3_release, reason: from getter */
    public final ChipColors getDefaultElevatedSuggestionChipColorsCached() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3_release(ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    /* JADX INFO: renamed from: getDefaultFilterChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultFilterChipColorsCached() {
        return this.defaultFilterChipColorsCached;
    }

    public final void setDefaultFilterChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    /* JADX INFO: renamed from: getDefaultElevatedFilterChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    /* JADX INFO: renamed from: getDefaultInputChipColorsCached$material3_release, reason: from getter */
    public final SelectableChipColors getDefaultInputChipColorsCached() {
        return this.defaultInputChipColorsCached;
    }

    public final void setDefaultInputChipColorsCached$material3_release(SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    /* JADX INFO: renamed from: getDefaultTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    /* JADX INFO: renamed from: getDefaultCenterAlignedTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultCenterAlignedTopAppBarColorsCached = topAppBarColors;
    }

    /* JADX INFO: renamed from: getDefaultMediumTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultMediumTopAppBarColorsCached = topAppBarColors;
    }

    /* JADX INFO: renamed from: getDefaultLargeTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultLargeTopAppBarColorsCached = topAppBarColors;
    }

    /* JADX INFO: renamed from: getDefaultCheckboxColorsCached$material3_release, reason: from getter */
    public final CheckboxColors getDefaultCheckboxColorsCached() {
        return this.defaultCheckboxColorsCached;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    /* JADX INFO: renamed from: getDefaultDatePickerColorsCached$material3_release, reason: from getter */
    public final DatePickerColors getDefaultDatePickerColorsCached() {
        return this.defaultDatePickerColorsCached;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    /* JADX INFO: renamed from: getDefaultIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButtonColors getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    /* JADX INFO: renamed from: getDefaultMenuItemColorsCached$material3_release, reason: from getter */
    public final MenuItemColors getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    /* JADX INFO: renamed from: getDefaultNavigationBarItemColorsCached$material3_release, reason: from getter */
    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached() {
        return this.defaultNavigationBarItemColorsCached;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    /* JADX INFO: renamed from: getDefaultNavigationRailItemColorsCached$material3_release, reason: from getter */
    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached() {
        return this.defaultNavigationRailItemColorsCached;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3_release(NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    /* JADX INFO: renamed from: getDefaultRadioButtonColorsCached$material3_release, reason: from getter */
    public final RadioButtonColors getDefaultRadioButtonColorsCached() {
        return this.defaultRadioButtonColorsCached;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    /* JADX INFO: renamed from: getDefaultSegmentedButtonColorsCached$material3_release, reason: from getter */
    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached() {
        return this.defaultSegmentedButtonColorsCached;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3_release(SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    /* JADX INFO: renamed from: getDefaultSliderColorsCached$material3_release, reason: from getter */
    public final SliderColors getDefaultSliderColorsCached() {
        return this.defaultSliderColorsCached;
    }

    public final void setDefaultSliderColorsCached$material3_release(SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    /* JADX INFO: renamed from: getDefaultSwitchColorsCached$material3_release, reason: from getter */
    public final SwitchColors getDefaultSwitchColorsCached() {
        return this.defaultSwitchColorsCached;
    }

    public final void setDefaultSwitchColorsCached$material3_release(SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    /* JADX INFO: renamed from: getDefaultOutlinedTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    /* JADX INFO: renamed from: getDefaultTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultTextFieldColorsCached() {
        return this.defaultTextFieldColorsCached;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    /* JADX INFO: renamed from: getDefaultTimePickerColorsCached$material3_release, reason: from getter */
    public final TimePickerColors getDefaultTimePickerColorsCached() {
        return this.defaultTimePickerColorsCached;
    }

    public final void setDefaultTimePickerColorsCached$material3_release(TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    /* JADX INFO: renamed from: getDefaultRichTooltipColorsCached$material3_release, reason: from getter */
    public final RichTooltipColors getDefaultRichTooltipColorsCached() {
        return this.defaultRichTooltipColorsCached;
    }

    public final void setDefaultRichTooltipColorsCached$material3_release(RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36);
    }

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }
}
