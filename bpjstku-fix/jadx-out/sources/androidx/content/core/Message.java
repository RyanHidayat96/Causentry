package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import defpackage.isHuaweiMate20;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f"}, d2 = {"Landroidx/datastore/core/Message;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "lastState", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Message<T> {
    public abstract State<T> getLastState();

    private Message() {
    }

    public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/datastore/core/Message$Read;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Message;", "Landroidx/datastore/core/State;", "p0", "<init>", "(Landroidx/datastore/core/State;)V", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        @Override // androidx.content.core.Message
        public final State<T> getLastState() {
            return this.lastState;
        }

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BV\u0012'\u0010\u0007\u001a#\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR;\u0010\u001c\u001a#\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/datastore/core/Message$Update;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Message;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "p0", "LisHuaweiMate20;", "p1", "Landroidx/datastore/core/State;", "p2", "Lkotlin/coroutines/CoroutineContext;", "p3", "<init>", "(Lkotlin/jvm/functions/Function2;LisHuaweiMate20;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "ack", "LisHuaweiMate20;", "getAck", "()LisHuaweiMate20;", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "transform", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Update<T> extends Message<T> {
        private final isHuaweiMate20<T> ack;
        private final CoroutineContext callerContext;
        private final State<T> lastState;
        private final Function2<T, Continuation<? super T>, Object> transform;

        public final Function2<T, Continuation<? super T>, Object> getTransform() {
            return this.transform;
        }

        public final isHuaweiMate20<T> getAck() {
            return this.ack;
        }

        @Override // androidx.content.core.Message
        public final State<T> getLastState() {
            return this.lastState;
        }

        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Update(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, isHuaweiMate20<T> ishuaweimate20, State<T> state, CoroutineContext coroutineContext) {
            super(null);
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(ishuaweimate20, "");
            Intrinsics.checkNotNullParameter(coroutineContext, "");
            this.transform = function2;
            this.ack = ishuaweimate20;
            this.lastState = state;
            this.callerContext = coroutineContext;
        }
    }
}
