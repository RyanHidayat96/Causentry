package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public enum ToNumberPolicy implements ToNumberStrategy {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        public final Double readNumber(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        public final Number readNumber(JsonReader jsonReader) throws IOException {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        @Override // com.google.gson.ToNumberStrategy
        public final Number readNumber(JsonReader jsonReader) throws JsonParseException, IOException {
            String strNextString = jsonReader.nextString();
            try {
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException e2) {
                    StringBuilder sb = new StringBuilder("Cannot parse ");
                    sb.append(strNextString);
                    sb.append("; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new JsonParseException(sb.toString(), e2);
                }
            } catch (NumberFormatException unused) {
                Double dValueOf = Double.valueOf(strNextString);
                if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || jsonReader.isLenient()) {
                    return dValueOf;
                }
                StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(dValueOf);
                sb2.append("; at path ");
                sb2.append(jsonReader.getPreviousPath());
                throw new MalformedJsonException(sb2.toString());
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        public final BigDecimal readNumber(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return new BigDecimal(strNextString);
            } catch (NumberFormatException e2) {
                StringBuilder sb = new StringBuilder("Cannot parse ");
                sb.append(strNextString);
                sb.append("; at path ");
                sb.append(jsonReader.getPreviousPath());
                throw new JsonParseException(sb.toString(), e2);
            }
        }
    }
}
