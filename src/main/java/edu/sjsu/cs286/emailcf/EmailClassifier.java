package edu.sjsu.cs286.emailcf;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Arrays;

import scala.Tuple2;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;

public class EmailClassifier {

	public static void main(String[] args) throws Exception {
		String inputFile = args[0];
		String outputFile = args[1];
		
		// Create a Java Spark Context.
		SparkConf conf = new SparkConf().setAppName("EmailClassifier");
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		/* Read Data */
		// Read data from CSV
		JavaRDD<String> input = sc.textFile(inputFile);

		/* Split data as testing and training */
		// 70% is training, 30% is testing data
		
		/* Training */
		// Create model
		
		/* Testing */
		// Test the classifier
		
		/* Confusion Matrix*/
		
	}
}
