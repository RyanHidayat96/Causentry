package com.bpjstku.data.asik.model.request;

import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e\u0012\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010,J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010,J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010,J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010,J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010,J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010,J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010,J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010,J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010,J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010,J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010,J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010,J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010,J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010,J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010,J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010,J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010,J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010,J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010,J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010,J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010,J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010,J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010,J\u0018\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eHÇ\u0003¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001eHÇ\u0003¢\u0006\u0004\bI\u0010HJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010,J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010,J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010,J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010,J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010,J\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u0010,JÀ\u0003\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010T\u001a\u00020S2\b\u0010\u0003\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010W\u001a\u00020VHÖ\u0001¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bY\u0010,R\u001c\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010,R\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010[\u001a\u0004\b^\u0010,R\u001c\u0010_\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010[\u001a\u0004\b`\u0010,R\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010[\u001a\u0004\bb\u0010,R\u001c\u0010c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010[\u001a\u0004\bd\u0010,R\u001c\u0010e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010[\u001a\u0004\bf\u0010,R\u001c\u0010g\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010[\u001a\u0004\bh\u0010,R\u001c\u0010i\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010[\u001a\u0004\bj\u0010,R\u001c\u0010k\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010[\u001a\u0004\bl\u0010,R\u001c\u0010m\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010[\u001a\u0004\bn\u0010,R\u001c\u0010o\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010[\u001a\u0004\bp\u0010,R\u001c\u0010q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010[\u001a\u0004\br\u0010,R\u001c\u0010s\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010[\u001a\u0004\bt\u0010,R\u001c\u0010u\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010[\u001a\u0004\bv\u0010,R\u001c\u0010w\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010[\u001a\u0004\bx\u0010,R\u001c\u0010y\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010[\u001a\u0004\bz\u0010,R\u001c\u0010{\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010[\u001a\u0004\b|\u0010,R\u001c\u0010}\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010[\u001a\u0004\b~\u0010,R\u001d\u0010\u007f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010[\u001a\u0005\b\u0080\u0001\u0010,R\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010[\u001a\u0005\b\u0082\u0001\u0010,R\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010[\u001a\u0005\b\u0084\u0001\u0010,R\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010[\u001a\u0005\b\u0086\u0001\u0010,R\u001f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010[\u001a\u0005\b\u0088\u0001\u0010,R\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010[\u001a\u0005\b\u008a\u0001\u0010,R\u001f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010[\u001a\u0005\b\u008c\u0001\u0010,R\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010[\u001a\u0005\b\u008e\u0001\u0010,R\u001f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010[\u001a\u0005\b\u0090\u0001\u0010,R&\u0010\u0091\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010HR&\u0010\u0094\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001e8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0092\u0001\u001a\u0005\b\u0095\u0001\u0010HR\u001f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010[\u001a\u0005\b\u0097\u0001\u0010,R\u001f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010[\u001a\u0005\b\u0099\u0001\u0010,R\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010[\u001a\u0005\b\u009b\u0001\u0010,R\u001f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010[\u001a\u0005\b\u009d\u0001\u0010,R\u001f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010[\u001a\u0005\b\u009f\u0001\u0010,R\u001f\u0010 \u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0001\u0010[\u001a\u0005\b¡\u0001\u0010,"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AsikRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "", "Lcom/bpjstku/data/asik/model/request/EmployeeKpjRequest;", "p27", "Lcom/bpjstku/data/asik/model/request/EmployeeFamilyRequest;", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Ljava/util/List;", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/request/AsikRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "email", "getEmail", "nama", "getNama", "tempatLahir", "getTempatLahir", "tglLahir", "getTglLahir", "alamat", "getAlamat", "kodeAlamat", "getKodeAlamat", "nomorTelepon", "getNomorTelepon", "nomorHandphone", "getNomorHandphone", "namaIbuKandung", "getNamaIbuKandung", "npwp", "getNpwp", "kodeBank", "getKodeBank", "namaBank", "getNamaBank", "nomorRekening", "getNomorRekening", "namaRekening", "getNamaRekening", "userRekam", "getUserRekam", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "statusKawin", "getStatusKawin", "kodePendidikanTerakhir", "getKodePendidikanTerakhir", "kodeAgama", "getKodeAgama", "golonganDarah", "getGolonganDarah", "namaKontakDarurat", "getNamaKontakDarurat", "noHpKontakDarurat", "getNoHpKontakDarurat", "alamatKontakDarurat", "getAlamatKontakDarurat", "kodeAlamatKontakDarurat", "getKodeAlamatKontakDarurat", "kodeHubunganKontakDarurat", "getKodeHubunganKontakDarurat", "transactionId", "getTransactionId", "kpj", "Ljava/util/List;", "getKpj", "keluarga", "getKeluarga", "nomorPasspor", "getNomorPasspor", "tglBerlakuPasspor", "getTglBerlakuPasspor", "signature", "getSignature", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("alamat")
    private final String alamat;

    @SerializedName("alamatKontakDarurat")
    private final String alamatKontakDarurat;

    @SerializedName("email")
    private final String email;

    @SerializedName("jenisKelamin")
    private final String gender;

    @SerializedName("golonganDarah")
    private final String golonganDarah;

    @SerializedName("keluarga")
    private final List<EmployeeFamilyRequest> keluarga;

    @SerializedName("kodeAgama")
    private final String kodeAgama;

    @SerializedName("kodeAlamat")
    private final String kodeAlamat;

    @SerializedName("kodeAlamatKontakDarurat")
    private final String kodeAlamatKontakDarurat;

    @SerializedName("kodeBank")
    private final String kodeBank;

    @SerializedName("kodeHubunganKontakDarurat")
    private final String kodeHubunganKontakDarurat;

    @SerializedName("kodePendidikanTerakhir")
    private final String kodePendidikanTerakhir;

    @SerializedName("kpj")
    private final List<EmployeeKpjRequest> kpj;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("namaBank")
    private final String namaBank;

    @SerializedName("namaIbuKandung")
    private final String namaIbuKandung;

    @SerializedName("namaKontakDarurat")
    private final String namaKontakDarurat;

    @SerializedName("namaRekening")
    private final String namaRekening;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHpKontakDarurat")
    private final String noHpKontakDarurat;

    @SerializedName("nomorHandphone")
    private final String nomorHandphone;

    @SerializedName("nomorPasspor")
    private final String nomorPasspor;

    @SerializedName("nomorRekening")
    private final String nomorRekening;

    @SerializedName("nomorTelepon")
    private final String nomorTelepon;

    @SerializedName("npwp")
    private final String npwp;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("statusKawin")
    private final String statusKawin;

    @SerializedName("tempatLahir")
    private final String tempatLahir;

    @SerializedName("tglBerlakuPasspor")
    private final String tglBerlakuPasspor;

    @SerializedName("tglLahir")
    private final String tglLahir;

    @SerializedName("transactionId")
    private final String transactionId;

    @SerializedName("userRekam")
    private final String userRekam;

    public final String getNik() {
        return this.nik;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final String getAlamat() {
        return this.alamat;
    }

    public final String getKodeAlamat() {
        return this.kodeAlamat;
    }

    public final String getNomorTelepon() {
        return this.nomorTelepon;
    }

    public final String getNomorHandphone() {
        return this.nomorHandphone;
    }

    public final String getNamaIbuKandung() {
        return this.namaIbuKandung;
    }

    public final String getNpwp() {
        return this.npwp;
    }

    public final String getKodeBank() {
        return this.kodeBank;
    }

    public final String getNamaBank() {
        return this.namaBank;
    }

    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    public final String getNamaRekening() {
        return this.namaRekening;
    }

    public final String getUserRekam() {
        return this.userRekam;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getStatusKawin() {
        return this.statusKawin;
    }

    public final String getKodePendidikanTerakhir() {
        return this.kodePendidikanTerakhir;
    }

    public final String getKodeAgama() {
        return this.kodeAgama;
    }

    public final String getGolonganDarah() {
        return this.golonganDarah;
    }

    public final String getNamaKontakDarurat() {
        return this.namaKontakDarurat;
    }

    public final String getNoHpKontakDarurat() {
        return this.noHpKontakDarurat;
    }

    public final String getAlamatKontakDarurat() {
        return this.alamatKontakDarurat;
    }

    public final String getKodeAlamatKontakDarurat() {
        return this.kodeAlamatKontakDarurat;
    }

    public final String getKodeHubunganKontakDarurat() {
        return this.kodeHubunganKontakDarurat;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final List<EmployeeKpjRequest> getKpj() {
        return this.kpj;
    }

    public final List<EmployeeFamilyRequest> getKeluarga() {
        return this.keluarga;
    }

    public final String getNomorPasspor() {
        return this.nomorPasspor;
    }

    public final String getTglBerlakuPasspor() {
        return this.tglBerlakuPasspor;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getLocality() {
        return this.locality;
    }

    public AsikRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, List<EmployeeKpjRequest> list, List<EmployeeFamilyRequest> list2, String str28, String str29, String str30, String str31, String str32, String str33) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.nik = str;
        this.email = str2;
        this.nama = str3;
        this.tempatLahir = str4;
        this.tglLahir = str5;
        this.alamat = str6;
        this.kodeAlamat = str7;
        this.nomorTelepon = str8;
        this.nomorHandphone = str9;
        this.namaIbuKandung = str10;
        this.npwp = str11;
        this.kodeBank = str12;
        this.namaBank = str13;
        this.nomorRekening = str14;
        this.namaRekening = str15;
        this.userRekam = str16;
        this.gender = str17;
        this.statusKawin = str18;
        this.kodePendidikanTerakhir = str19;
        this.kodeAgama = str20;
        this.golonganDarah = str21;
        this.namaKontakDarurat = str22;
        this.noHpKontakDarurat = str23;
        this.alamatKontakDarurat = str24;
        this.kodeAlamatKontakDarurat = str25;
        this.kodeHubunganKontakDarurat = str26;
        this.transactionId = str27;
        this.kpj = list;
        this.keluarga = list2;
        this.nomorPasspor = str28;
        this.tglBerlakuPasspor = str29;
        this.signature = str30;
        this.latitude = str31;
        this.longitude = str32;
        this.locality = str33;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNamaIbuKandung() {
        return this.namaIbuKandung;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNpwp() {
        return this.npwp;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getKodeBank() {
        return this.kodeBank;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNamaBank() {
        return this.namaBank;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getNamaRekening() {
        return this.namaRekening;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUserRekam() {
        return this.userRekam;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getStatusKawin() {
        return this.statusKawin;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getKodePendidikanTerakhir() {
        return this.kodePendidikanTerakhir;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getKodeAgama() {
        return this.kodeAgama;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getGolonganDarah() {
        return this.golonganDarah;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getNamaKontakDarurat() {
        return this.namaKontakDarurat;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getNoHpKontakDarurat() {
        return this.noHpKontakDarurat;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getAlamatKontakDarurat() {
        return this.alamatKontakDarurat;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getKodeAlamatKontakDarurat() {
        return this.kodeAlamatKontakDarurat;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getKodeHubunganKontakDarurat() {
        return this.kodeHubunganKontakDarurat;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final List<EmployeeKpjRequest> component28() {
        return this.kpj;
    }

    public final List<EmployeeFamilyRequest> component29() {
        return this.keluarga;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getNomorPasspor() {
        return this.nomorPasspor;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTglBerlakuPasspor() {
        return this.tglBerlakuPasspor;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAlamat() {
        return this.alamat;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKodeAlamat() {
        return this.kodeAlamat;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNomorTelepon() {
        return this.nomorTelepon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNomorHandphone() {
        return this.nomorHandphone;
    }

    public final AsikRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23, String p24, String p25, String p26, List<EmployeeKpjRequest> p27, List<EmployeeFamilyRequest> p28, String p29, String p30, String p31, String p32, String p33, String p34) {
        Intrinsics.checkNotNullParameter(p27, "");
        Intrinsics.checkNotNullParameter(p28, "");
        return new AsikRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikRequest)) {
            return false;
        }
        AsikRequest asikRequest = (AsikRequest) p0;
        return Intrinsics.areEqual(this.nik, asikRequest.nik) && Intrinsics.areEqual(this.email, asikRequest.email) && Intrinsics.areEqual(this.nama, asikRequest.nama) && Intrinsics.areEqual(this.tempatLahir, asikRequest.tempatLahir) && Intrinsics.areEqual(this.tglLahir, asikRequest.tglLahir) && Intrinsics.areEqual(this.alamat, asikRequest.alamat) && Intrinsics.areEqual(this.kodeAlamat, asikRequest.kodeAlamat) && Intrinsics.areEqual(this.nomorTelepon, asikRequest.nomorTelepon) && Intrinsics.areEqual(this.nomorHandphone, asikRequest.nomorHandphone) && Intrinsics.areEqual(this.namaIbuKandung, asikRequest.namaIbuKandung) && Intrinsics.areEqual(this.npwp, asikRequest.npwp) && Intrinsics.areEqual(this.kodeBank, asikRequest.kodeBank) && Intrinsics.areEqual(this.namaBank, asikRequest.namaBank) && Intrinsics.areEqual(this.nomorRekening, asikRequest.nomorRekening) && Intrinsics.areEqual(this.namaRekening, asikRequest.namaRekening) && Intrinsics.areEqual(this.userRekam, asikRequest.userRekam) && Intrinsics.areEqual(this.gender, asikRequest.gender) && Intrinsics.areEqual(this.statusKawin, asikRequest.statusKawin) && Intrinsics.areEqual(this.kodePendidikanTerakhir, asikRequest.kodePendidikanTerakhir) && Intrinsics.areEqual(this.kodeAgama, asikRequest.kodeAgama) && Intrinsics.areEqual(this.golonganDarah, asikRequest.golonganDarah) && Intrinsics.areEqual(this.namaKontakDarurat, asikRequest.namaKontakDarurat) && Intrinsics.areEqual(this.noHpKontakDarurat, asikRequest.noHpKontakDarurat) && Intrinsics.areEqual(this.alamatKontakDarurat, asikRequest.alamatKontakDarurat) && Intrinsics.areEqual(this.kodeAlamatKontakDarurat, asikRequest.kodeAlamatKontakDarurat) && Intrinsics.areEqual(this.kodeHubunganKontakDarurat, asikRequest.kodeHubunganKontakDarurat) && Intrinsics.areEqual(this.transactionId, asikRequest.transactionId) && Intrinsics.areEqual(this.kpj, asikRequest.kpj) && Intrinsics.areEqual(this.keluarga, asikRequest.keluarga) && Intrinsics.areEqual(this.nomorPasspor, asikRequest.nomorPasspor) && Intrinsics.areEqual(this.tglBerlakuPasspor, asikRequest.tglBerlakuPasspor) && Intrinsics.areEqual(this.signature, asikRequest.signature) && Intrinsics.areEqual(this.latitude, asikRequest.latitude) && Intrinsics.areEqual(this.longitude, asikRequest.longitude) && Intrinsics.areEqual(this.locality, asikRequest.locality);
    }

    public final int hashCode() {
        String str = this.nik;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nama;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tempatLahir;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tglLahir;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.alamat;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.kodeAlamat;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.nomorTelepon;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.nomorHandphone;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.namaIbuKandung;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.npwp;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.kodeBank;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.namaBank;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.nomorRekening;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.namaRekening;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.userRekam;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.gender;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.statusKawin;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.kodePendidikanTerakhir;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.kodeAgama;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.golonganDarah;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.namaKontakDarurat;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.noHpKontakDarurat;
        int iHashCode23 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.alamatKontakDarurat;
        int iHashCode24 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.kodeAlamatKontakDarurat;
        int iHashCode25 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.kodeHubunganKontakDarurat;
        int iHashCode26 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.transactionId;
        int iHashCode27 = str27 == null ? 0 : str27.hashCode();
        int iHashCode28 = this.kpj.hashCode();
        int iHashCode29 = this.keluarga.hashCode();
        String str28 = this.nomorPasspor;
        int iHashCode30 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.tglBerlakuPasspor;
        int iHashCode31 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.signature;
        int iHashCode32 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.latitude;
        int iHashCode33 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.longitude;
        int iHashCode34 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.locality;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (str33 != null ? str33.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.email;
        String str3 = this.nama;
        String str4 = this.tempatLahir;
        String str5 = this.tglLahir;
        String str6 = this.alamat;
        String str7 = this.kodeAlamat;
        String str8 = this.nomorTelepon;
        String str9 = this.nomorHandphone;
        String str10 = this.namaIbuKandung;
        String str11 = this.npwp;
        String str12 = this.kodeBank;
        String str13 = this.namaBank;
        String str14 = this.nomorRekening;
        String str15 = this.namaRekening;
        String str16 = this.userRekam;
        String str17 = this.gender;
        String str18 = this.statusKawin;
        String str19 = this.kodePendidikanTerakhir;
        String str20 = this.kodeAgama;
        String str21 = this.golonganDarah;
        String str22 = this.namaKontakDarurat;
        String str23 = this.noHpKontakDarurat;
        String str24 = this.alamatKontakDarurat;
        String str25 = this.kodeAlamatKontakDarurat;
        String str26 = this.kodeHubunganKontakDarurat;
        String str27 = this.transactionId;
        List<EmployeeKpjRequest> list = this.kpj;
        List<EmployeeFamilyRequest> list2 = this.keluarga;
        String str28 = this.nomorPasspor;
        String str29 = this.tglBerlakuPasspor;
        String str30 = this.signature;
        String str31 = this.latitude;
        String str32 = this.longitude;
        String str33 = this.locality;
        StringBuilder sb = new StringBuilder("AsikRequest(nik=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", nama=");
        sb.append(str3);
        sb.append(", tempatLahir=");
        sb.append(str4);
        sb.append(", tglLahir=");
        sb.append(str5);
        sb.append(", alamat=");
        sb.append(str6);
        sb.append(", kodeAlamat=");
        sb.append(str7);
        sb.append(", nomorTelepon=");
        sb.append(str8);
        sb.append(", nomorHandphone=");
        sb.append(str9);
        sb.append(", namaIbuKandung=");
        sb.append(str10);
        sb.append(", npwp=");
        sb.append(str11);
        sb.append(", kodeBank=");
        sb.append(str12);
        sb.append(", namaBank=");
        sb.append(str13);
        sb.append(", nomorRekening=");
        sb.append(str14);
        sb.append(", namaRekening=");
        sb.append(str15);
        sb.append(", userRekam=");
        sb.append(str16);
        sb.append(", gender=");
        sb.append(str17);
        sb.append(", statusKawin=");
        sb.append(str18);
        sb.append(", kodePendidikanTerakhir=");
        sb.append(str19);
        sb.append(", kodeAgama=");
        sb.append(str20);
        sb.append(", golonganDarah=");
        sb.append(str21);
        sb.append(", namaKontakDarurat=");
        sb.append(str22);
        sb.append(", noHpKontakDarurat=");
        sb.append(str23);
        sb.append(", alamatKontakDarurat=");
        sb.append(str24);
        sb.append(", kodeAlamatKontakDarurat=");
        sb.append(str25);
        sb.append(", kodeHubunganKontakDarurat=");
        sb.append(str26);
        sb.append(", transactionId=");
        sb.append(str27);
        sb.append(", kpj=");
        sb.append(list);
        sb.append(", keluarga=");
        sb.append(list2);
        sb.append(", nomorPasspor=");
        sb.append(str28);
        sb.append(", tglBerlakuPasspor=");
        sb.append(str29);
        sb.append(", signature=");
        sb.append(str30);
        sb.append(", latitude=");
        sb.append(str31);
        sb.append(", longitude=");
        sb.append(str32);
        sb.append(", locality=");
        sb.append(str33);
        sb.append(")");
        return sb.toString();
    }
}
