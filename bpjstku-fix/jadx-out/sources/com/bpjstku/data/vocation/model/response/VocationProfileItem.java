package com.bpjstku.data.vocation.model.response;

import androidx.autofill.HintConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\bS\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bR\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010-J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010-J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010-J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010-J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010-J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010-J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010-J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010-J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010-J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010-J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010-J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010-J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010-J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010-J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010-J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010-J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010-J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010-J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010-J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010-J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010-J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010-J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010-J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010-J\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u0010-J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010-J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010-J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010-J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010-Jä\u0003\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010W\u001a\u00020V2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Z\u001a\u00020YHÖ\u0001¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\\\u0010-R\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010-R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010^\u001a\u0004\ba\u0010-R\u001c\u0010b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010-R\u001c\u0010d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010^\u001a\u0004\be\u0010-R\u001c\u0010f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010^\u001a\u0004\bg\u0010-R\u001c\u0010h\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010^\u001a\u0004\bi\u0010-R\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010^\u001a\u0004\bk\u0010-R\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010-R\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010^\u001a\u0004\bo\u0010-R\u001c\u0010p\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010^\u001a\u0004\bq\u0010-R\u001c\u0010r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010^\u001a\u0004\bs\u0010-R\u001c\u0010t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010^\u001a\u0004\bu\u0010-R\u001c\u0010v\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010^\u001a\u0004\bw\u0010-R\u001c\u0010x\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010^\u001a\u0004\by\u0010-R\u001c\u0010z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010^\u001a\u0004\b{\u0010-R\u001c\u0010|\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010^\u001a\u0004\b}\u0010-R\u001c\u0010~\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010^\u001a\u0004\b\u007f\u0010-R\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010-R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010^\u001a\u0005\b\u0083\u0001\u0010-R\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010^\u001a\u0005\b\u0085\u0001\u0010-R\u001f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010^\u001a\u0005\b\u0087\u0001\u0010-R\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010^\u001a\u0005\b\u0089\u0001\u0010-R\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010^\u001a\u0005\b\u008b\u0001\u0010-R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010^\u001a\u0005\b\u008d\u0001\u0010-R\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010^\u001a\u0005\b\u008f\u0001\u0010-R\u001f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010^\u001a\u0005\b\u0091\u0001\u0010-R\u001f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010^\u001a\u0005\b\u0093\u0001\u0010-R\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010^\u001a\u0005\b\u0095\u0001\u0010-R\u001f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010^\u001a\u0005\b\u0097\u0001\u0010-R\u001f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010^\u001a\u0005\b\u0099\u0001\u0010-R\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010^\u001a\u0005\b\u009b\u0001\u0010-R\u001f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010^\u001a\u0005\b\u009d\u0001\u0010-R\u001f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010^\u001a\u0005\b\u009f\u0001\u0010-R\u001f\u0010 \u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0001\u0010^\u001a\u0005\b¡\u0001\u0010-R\u001f\u0010¢\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¢\u0001\u0010^\u001a\u0005\b£\u0001\u0010-R\u001f\u0010¤\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¤\u0001\u0010^\u001a\u0005\b¥\u0001\u0010-R\u001f\u0010¦\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¦\u0001\u0010^\u001a\u0005\b§\u0001\u0010-R\u001f\u0010¨\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¨\u0001\u0010^\u001a\u0005\b©\u0001\u0010-R\u001f\u0010ª\u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bª\u0001\u0010^\u001a\u0005\b«\u0001\u0010-"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/VocationProfileItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "p36", "p37", "p38", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/response/VocationProfileItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "presence", "Ljava/lang/String;", "getPresence", PlaceTypes.ADDRESS, "getAddress", "officeAddress", "getOfficeAddress", "bankCode", "getBankCode", "bankName", "getBankName", "email", "getEmail", "result", "getResult", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "trainingType", "getTrainingType", "remarks", "getRemarks", "iksBlkDtlCode", "getIksBlkDtlCode", "scheduleCode", "getScheduleCode", "officeCode", "getOfficeCode", "externalEmployeeCode", "getExternalEmployeeCode", "trainingCode", "getTrainingCode", "registrationCode", "getRegistrationCode", "tkCode", "getTkCode", "kpj", "getKpj", "name", "getName", "blkName", "getBlkName", "bankBranchOfficeName", "getBankBranchOfficeName", "accountName", "getAccountName", "officeName", "getOfficeName", "trainingName", "getTrainingName", "nik", "getNik", FirebaseAnalytics.Param.SCORE, "getScore", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "accountNumber", "getAccountNumber", "npwp", "getNpwp", "formalEducation", "getFormalEducation", "nonFormalEducation", "getNonFormalEducation", "wagePreference", "getWagePreference", "activeStatus", "getActiveStatus", "confirmationStatus", "getConfirmationStatus", "ratingStatus", "getRatingStatus", "trainingEndDate", "getTrainingEndDate", "activeDate", "getActiveDate", "confirmationDate", "getConfirmationDate", "birthdate", "getBirthdate"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VocationProfileItem {
    public static final int $stable = 0;

    @SerializedName("namaDalamRekening")
    private final String accountName;

    @SerializedName("noRekening")
    private final String accountNumber;

    @SerializedName("tglAktif")
    private final String activeDate;

    @SerializedName("statusAktif")
    private final String activeStatus;

    @SerializedName("alamat")
    private final String address;

    @SerializedName("namaCabangBank")
    private final String bankBranchOfficeName;

    @SerializedName("bankRekening")
    private final String bankCode;

    @SerializedName("bankName")
    private final String bankName;

    @SerializedName("tglLahir")
    private final String birthdate;

    @SerializedName("namaBlk")
    private final String blkName;

    @SerializedName("tglKonfirmasi")
    private final String confirmationDate;

    @SerializedName("statusKonfirmasi")
    private final String confirmationStatus;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodePegawaiExternal")
    private final String externalEmployeeCode;

    @SerializedName("pendidikanFormal")
    private final String formalEducation;

    @SerializedName("jenisKelamin")
    private final String gender;

    @SerializedName("kodeIksBlkDtl")
    private final String iksBlkDtlCode;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("nama")
    private final String name;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("pendidikanNonFormal")
    private final String nonFormalEducation;

    @SerializedName("npwp")
    private final String npwp;

    @SerializedName("alamatKantor")
    private final String officeAddress;

    @SerializedName("kodeKantor")
    private final String officeCode;

    @SerializedName("namaKantor")
    private final String officeName;

    @SerializedName("noHp")
    private final String phoneNumber;

    @SerializedName("absensi")
    private final String presence;

    @SerializedName("statusRating")
    private final String ratingStatus;

    @SerializedName("kodePendaftaran")
    private final String registrationCode;

    @SerializedName("keterangan")
    private final String remarks;

    @SerializedName("hasil")
    private final String result;

    @SerializedName("kodeJadwal")
    private final String scheduleCode;

    @SerializedName("nilai")
    private final String score;

    @SerializedName("kodeTk")
    private final String tkCode;

    @SerializedName("kodePelatihan")
    private final String trainingCode;

    @SerializedName("tglAkhirPelatihan")
    private final String trainingEndDate;

    @SerializedName("namaPelatihan")
    private final String trainingName;

    @SerializedName("jenisPelatihan")
    private final String trainingType;

    @SerializedName("preferensiUpah")
    private final String wagePreference;

    public VocationProfileItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39) {
        this.presence = str;
        this.address = str2;
        this.officeAddress = str3;
        this.bankCode = str4;
        this.bankName = str5;
        this.email = str6;
        this.result = str7;
        this.gender = str8;
        this.trainingType = str9;
        this.remarks = str10;
        this.iksBlkDtlCode = str11;
        this.scheduleCode = str12;
        this.officeCode = str13;
        this.externalEmployeeCode = str14;
        this.trainingCode = str15;
        this.registrationCode = str16;
        this.tkCode = str17;
        this.kpj = str18;
        this.name = str19;
        this.blkName = str20;
        this.bankBranchOfficeName = str21;
        this.accountName = str22;
        this.officeName = str23;
        this.trainingName = str24;
        this.nik = str25;
        this.score = str26;
        this.phoneNumber = str27;
        this.accountNumber = str28;
        this.npwp = str29;
        this.formalEducation = str30;
        this.nonFormalEducation = str31;
        this.wagePreference = str32;
        this.activeStatus = str33;
        this.confirmationStatus = str34;
        this.ratingStatus = str35;
        this.trainingEndDate = str36;
        this.activeDate = str37;
        this.confirmationDate = str38;
        this.birthdate = str39;
    }

    public final String getPresence() {
        return this.presence;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getOfficeAddress() {
        return this.officeAddress;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getTrainingType() {
        return this.trainingType;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getIksBlkDtlCode() {
        return this.iksBlkDtlCode;
    }

    public final String getScheduleCode() {
        return this.scheduleCode;
    }

    public final String getOfficeCode() {
        return this.officeCode;
    }

    public final String getExternalEmployeeCode() {
        return this.externalEmployeeCode;
    }

    public final String getTrainingCode() {
        return this.trainingCode;
    }

    public final String getRegistrationCode() {
        return this.registrationCode;
    }

    public final String getTkCode() {
        return this.tkCode;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBlkName() {
        return this.blkName;
    }

    public final String getBankBranchOfficeName() {
        return this.bankBranchOfficeName;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getOfficeName() {
        return this.officeName;
    }

    public final String getTrainingName() {
        return this.trainingName;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getNpwp() {
        return this.npwp;
    }

    public final String getFormalEducation() {
        return this.formalEducation;
    }

    public final String getNonFormalEducation() {
        return this.nonFormalEducation;
    }

    public final String getWagePreference() {
        return this.wagePreference;
    }

    public final String getActiveStatus() {
        return this.activeStatus;
    }

    public final String getConfirmationStatus() {
        return this.confirmationStatus;
    }

    public final String getRatingStatus() {
        return this.ratingStatus;
    }

    public final String getTrainingEndDate() {
        return this.trainingEndDate;
    }

    public final String getActiveDate() {
        return this.activeDate;
    }

    public final String getConfirmationDate() {
        return this.confirmationDate;
    }

    public final String getBirthdate() {
        return this.birthdate;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPresence() {
        return this.presence;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIksBlkDtlCode() {
        return this.iksBlkDtlCode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getScheduleCode() {
        return this.scheduleCode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getExternalEmployeeCode() {
        return this.externalEmployeeCode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTrainingCode() {
        return this.trainingCode;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRegistrationCode() {
        return this.registrationCode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTkCode() {
        return this.tkCode;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getBlkName() {
        return this.blkName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBankBranchOfficeName() {
        return this.bankBranchOfficeName;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOfficeName() {
        return this.officeName;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTrainingName() {
        return this.trainingName;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getNpwp() {
        return this.npwp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfficeAddress() {
        return this.officeAddress;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getFormalEducation() {
        return this.formalEducation;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getNonFormalEducation() {
        return this.nonFormalEducation;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getWagePreference() {
        return this.wagePreference;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getActiveStatus() {
        return this.activeStatus;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getConfirmationStatus() {
        return this.confirmationStatus;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getRatingStatus() {
        return this.ratingStatus;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getTrainingEndDate() {
        return this.trainingEndDate;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getActiveDate() {
        return this.activeDate;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getConfirmationDate() {
        return this.confirmationDate;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getBirthdate() {
        return this.birthdate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTrainingType() {
        return this.trainingType;
    }

    public final VocationProfileItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23, String p24, String p25, String p26, String p27, String p28, String p29, String p30, String p31, String p32, String p33, String p34, String p35, String p36, String p37, String p38) {
        return new VocationProfileItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VocationProfileItem)) {
            return false;
        }
        VocationProfileItem vocationProfileItem = (VocationProfileItem) p0;
        return Intrinsics.areEqual(this.presence, vocationProfileItem.presence) && Intrinsics.areEqual(this.address, vocationProfileItem.address) && Intrinsics.areEqual(this.officeAddress, vocationProfileItem.officeAddress) && Intrinsics.areEqual(this.bankCode, vocationProfileItem.bankCode) && Intrinsics.areEqual(this.bankName, vocationProfileItem.bankName) && Intrinsics.areEqual(this.email, vocationProfileItem.email) && Intrinsics.areEqual(this.result, vocationProfileItem.result) && Intrinsics.areEqual(this.gender, vocationProfileItem.gender) && Intrinsics.areEqual(this.trainingType, vocationProfileItem.trainingType) && Intrinsics.areEqual(this.remarks, vocationProfileItem.remarks) && Intrinsics.areEqual(this.iksBlkDtlCode, vocationProfileItem.iksBlkDtlCode) && Intrinsics.areEqual(this.scheduleCode, vocationProfileItem.scheduleCode) && Intrinsics.areEqual(this.officeCode, vocationProfileItem.officeCode) && Intrinsics.areEqual(this.externalEmployeeCode, vocationProfileItem.externalEmployeeCode) && Intrinsics.areEqual(this.trainingCode, vocationProfileItem.trainingCode) && Intrinsics.areEqual(this.registrationCode, vocationProfileItem.registrationCode) && Intrinsics.areEqual(this.tkCode, vocationProfileItem.tkCode) && Intrinsics.areEqual(this.kpj, vocationProfileItem.kpj) && Intrinsics.areEqual(this.name, vocationProfileItem.name) && Intrinsics.areEqual(this.blkName, vocationProfileItem.blkName) && Intrinsics.areEqual(this.bankBranchOfficeName, vocationProfileItem.bankBranchOfficeName) && Intrinsics.areEqual(this.accountName, vocationProfileItem.accountName) && Intrinsics.areEqual(this.officeName, vocationProfileItem.officeName) && Intrinsics.areEqual(this.trainingName, vocationProfileItem.trainingName) && Intrinsics.areEqual(this.nik, vocationProfileItem.nik) && Intrinsics.areEqual(this.score, vocationProfileItem.score) && Intrinsics.areEqual(this.phoneNumber, vocationProfileItem.phoneNumber) && Intrinsics.areEqual(this.accountNumber, vocationProfileItem.accountNumber) && Intrinsics.areEqual(this.npwp, vocationProfileItem.npwp) && Intrinsics.areEqual(this.formalEducation, vocationProfileItem.formalEducation) && Intrinsics.areEqual(this.nonFormalEducation, vocationProfileItem.nonFormalEducation) && Intrinsics.areEqual(this.wagePreference, vocationProfileItem.wagePreference) && Intrinsics.areEqual(this.activeStatus, vocationProfileItem.activeStatus) && Intrinsics.areEqual(this.confirmationStatus, vocationProfileItem.confirmationStatus) && Intrinsics.areEqual(this.ratingStatus, vocationProfileItem.ratingStatus) && Intrinsics.areEqual(this.trainingEndDate, vocationProfileItem.trainingEndDate) && Intrinsics.areEqual(this.activeDate, vocationProfileItem.activeDate) && Intrinsics.areEqual(this.confirmationDate, vocationProfileItem.confirmationDate) && Intrinsics.areEqual(this.birthdate, vocationProfileItem.birthdate);
    }

    public final int hashCode() {
        String str = this.presence;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.officeAddress;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bankCode;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.bankName;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.email;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.result;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.gender;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.trainingType;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.remarks;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.iksBlkDtlCode;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.scheduleCode;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.officeCode;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.externalEmployeeCode;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.trainingCode;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.registrationCode;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.tkCode;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.kpj;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.name;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.blkName;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.bankBranchOfficeName;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.accountName;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.officeName;
        int iHashCode23 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.trainingName;
        int iHashCode24 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.nik;
        int iHashCode25 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.score;
        int iHashCode26 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.phoneNumber;
        int iHashCode27 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.accountNumber;
        int iHashCode28 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.npwp;
        int iHashCode29 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.formalEducation;
        int iHashCode30 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.nonFormalEducation;
        int iHashCode31 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.wagePreference;
        int iHashCode32 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.activeStatus;
        int iHashCode33 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.confirmationStatus;
        int iHashCode34 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.ratingStatus;
        int iHashCode35 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.trainingEndDate;
        int iHashCode36 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.activeDate;
        int iHashCode37 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.confirmationDate;
        int iHashCode38 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.birthdate;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + (str39 != null ? str39.hashCode() : 0);
    }

    public final String toString() {
        String str = this.presence;
        String str2 = this.address;
        String str3 = this.officeAddress;
        String str4 = this.bankCode;
        String str5 = this.bankName;
        String str6 = this.email;
        String str7 = this.result;
        String str8 = this.gender;
        String str9 = this.trainingType;
        String str10 = this.remarks;
        String str11 = this.iksBlkDtlCode;
        String str12 = this.scheduleCode;
        String str13 = this.officeCode;
        String str14 = this.externalEmployeeCode;
        String str15 = this.trainingCode;
        String str16 = this.registrationCode;
        String str17 = this.tkCode;
        String str18 = this.kpj;
        String str19 = this.name;
        String str20 = this.blkName;
        String str21 = this.bankBranchOfficeName;
        String str22 = this.accountName;
        String str23 = this.officeName;
        String str24 = this.trainingName;
        String str25 = this.nik;
        String str26 = this.score;
        String str27 = this.phoneNumber;
        String str28 = this.accountNumber;
        String str29 = this.npwp;
        String str30 = this.formalEducation;
        String str31 = this.nonFormalEducation;
        String str32 = this.wagePreference;
        String str33 = this.activeStatus;
        String str34 = this.confirmationStatus;
        String str35 = this.ratingStatus;
        String str36 = this.trainingEndDate;
        String str37 = this.activeDate;
        String str38 = this.confirmationDate;
        String str39 = this.birthdate;
        StringBuilder sb = new StringBuilder("VocationProfileItem(presence=");
        sb.append(str);
        sb.append(", address=");
        sb.append(str2);
        sb.append(", officeAddress=");
        sb.append(str3);
        sb.append(", bankCode=");
        sb.append(str4);
        sb.append(", bankName=");
        sb.append(str5);
        sb.append(", email=");
        sb.append(str6);
        sb.append(", result=");
        sb.append(str7);
        sb.append(", gender=");
        sb.append(str8);
        sb.append(", trainingType=");
        sb.append(str9);
        sb.append(", remarks=");
        sb.append(str10);
        sb.append(", iksBlkDtlCode=");
        sb.append(str11);
        sb.append(", scheduleCode=");
        sb.append(str12);
        sb.append(", officeCode=");
        sb.append(str13);
        sb.append(", externalEmployeeCode=");
        sb.append(str14);
        sb.append(", trainingCode=");
        sb.append(str15);
        sb.append(", registrationCode=");
        sb.append(str16);
        sb.append(", tkCode=");
        sb.append(str17);
        sb.append(", kpj=");
        sb.append(str18);
        sb.append(", name=");
        sb.append(str19);
        sb.append(", blkName=");
        sb.append(str20);
        sb.append(", bankBranchOfficeName=");
        sb.append(str21);
        sb.append(", accountName=");
        sb.append(str22);
        sb.append(", officeName=");
        sb.append(str23);
        sb.append(", trainingName=");
        sb.append(str24);
        sb.append(", nik=");
        sb.append(str25);
        sb.append(", score=");
        sb.append(str26);
        sb.append(", phoneNumber=");
        sb.append(str27);
        sb.append(", accountNumber=");
        sb.append(str28);
        sb.append(", npwp=");
        sb.append(str29);
        sb.append(", formalEducation=");
        sb.append(str30);
        sb.append(", nonFormalEducation=");
        sb.append(str31);
        sb.append(", wagePreference=");
        sb.append(str32);
        sb.append(", activeStatus=");
        sb.append(str33);
        sb.append(", confirmationStatus=");
        sb.append(str34);
        sb.append(", ratingStatus=");
        sb.append(str35);
        sb.append(", trainingEndDate=");
        sb.append(str36);
        sb.append(", activeDate=");
        sb.append(str37);
        sb.append(", confirmationDate=");
        sb.append(str38);
        sb.append(", birthdate=");
        sb.append(str39);
        sb.append(")");
        return sb.toString();
    }
}
