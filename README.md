# jmh-jackson-vs-gson
Jackson vs Gson performance using JMH

#Benachmark raw results  
                                                                  Mode  Cnt      Score      Error  Units  
SerializationBenchmark.benchmarkDeSerializationWithGSON100Kb     thrpt   20   1669.592 ±  247.549  ops/s  
SerializationBenchmark.benchmarkDeSerializationWithGSON10Kb      thrpt   20  13090.188 ±  639.759  ops/s  
SerializationBenchmark.benchmarkDeSerializationWithGSON1Kb       thrpt   20  32402.525 ± 1973.375  ops/s  
SerializationBenchmark.benchmarkDeSerializationWithGSON1Mb       thrpt   20    133.959 ±   21.557  ops/s  
SerializationBenchmark.benchmarkDeSerializationWithJackson100Kb  thrpt   20   4502.108 ±  514.712  ops/s  
SerializationBenchmark.benchmarkDeSerializationWithJackson10Kb   thrpt   20  19496.779 ± 1114.692  ops/s  
SerializationBenchmark.benchmarkDeSerializationWithJackson1Kb    thrpt   20  26643.270 ± 2353.677  ops/s  
SerializationBenchmark.benchmarkDeSerializationWithJackson1Mb    thrpt   20    501.856 ±   16.100  ops/s  

SerializationBenchmark.benchmarkSerializationWithGSON100Kb       thrpt   20   2610.657 ±  262.572  ops/s
SerializationBenchmark.benchmarkSerializationWithGSON10Kb        thrpt   20  14378.446 ±  773.182  ops/s
SerializationBenchmark.benchmarkSerializationWithGSON1Kb         thrpt   20  29809.442 ± 4182.657  ops/s
SerializationBenchmark.benchmarkSerializationWithGSON1MB         thrpt   20    231.997 ±   34.680  ops/s
SerializationBenchmark.benchmarkSerializationWithJackson100Kb    thrpt   20   2179.891 ±  354.101  ops/s
SerializationBenchmark.benchmarkSerializationWithJackson10Kb     thrpt   20  12787.313 ±  302.723  ops/s
SerializationBenchmark.benchmarkSerializationWithJackson1Kb      thrpt   20  21357.747 ±  834.981  ops/s
SerializationBenchmark.benchmarkSerializationWithJackson1MB      thrpt   20    319.328 ±   30.040  ops/s
