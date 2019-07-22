package org.sample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.openjdk.jmh.annotations.*;

public class SerializationBenchmark
{
    private static final ObjectMapper objectMapper1Kb = new ObjectMapper();
    private static final ObjectMapper objectMapper10Kb = new ObjectMapper();
    private static final ObjectMapper objectMapper100Kb = new ObjectMapper();
    private static final ObjectMapper objectMapper1mb = new ObjectMapper();

    private static final Gson gson1Kb = new Gson();
    private static final Gson gson10Kb = new Gson();
    private static final Gson gson100Kb = new Gson();
    private static final Gson gson1mb = new Gson();

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithJackson1Kb(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper1Kb.readValue(serializationDataProvider.jsonString1Kb, User.class);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithGSON1Kb(SerializationDataProvider serializationDataProvider) {
        return gson1Kb.fromJson(serializationDataProvider.jsonString1Kb, User.class);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithJackson10Kb(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper10Kb.readValue(serializationDataProvider.jsonString10Kb, User.class);
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithGSON10Kb(SerializationDataProvider serializationDataProvider) {
        return gson10Kb.fromJson(serializationDataProvider.jsonString10Kb, User.class);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithJackson100Kb(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper100Kb.readValue(serializationDataProvider.jsonString100Kb, User.class);
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithGSON100Kb(SerializationDataProvider serializationDataProvider) {
        return gson100Kb.fromJson(serializationDataProvider.jsonString100Kb, User.class);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithJackson1MB(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper1mb.readValue(serializationDataProvider.jsonString1mb, User.class);
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public User benchmarkSerializationWithGSON1MB(SerializationDataProvider serializationDataProvider) {
        return gson1mb.fromJson(serializationDataProvider.jsonString1mb, User.class);
    }

    // SERIALIZE
    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithJackson1Kb(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper1Kb.writeValueAsString(serializationDataProvider.obj1Kb);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithGSON1Kb(SerializationDataProvider serializationDataProvider) {
        return gson1Kb.toJson(serializationDataProvider.obj1Kb);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithJackson10Kb(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper1Kb.writeValueAsString(serializationDataProvider.obj10Kb);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithGSON10Kb(SerializationDataProvider serializationDataProvider) {
        return gson1Kb.toJson(serializationDataProvider.obj10Kb);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithJackson100Kb(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper1Kb.writeValueAsString(serializationDataProvider.obj100Kb);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithGSON100Kb(SerializationDataProvider serializationDataProvider) {
        return gson1Kb.toJson(serializationDataProvider.obj100Kb);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithJackson1Mb(SerializationDataProvider serializationDataProvider) throws IOException
    {
        return objectMapper1Kb.writeValueAsString(serializationDataProvider.obj1000Kb);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode({Mode.Throughput})
    @Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
    public String benchmarkDeSerializationWithGSON1Mb(SerializationDataProvider serializationDataProvider) {
        return gson1Kb.toJson(serializationDataProvider.obj1000Kb);
    }
}
