/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * For every single input file (for example, gs://a/b/c.[extension]), we
   * generate at most 2 * n output files. (n is the # of target_language_codes
   * in the BatchTranslateTextRequest).
   *
   * Output files (tsv) generated are compliant with RFC 4180 except that
   * record delimiters are '&#92;n' instead of '&#92;r&#92;n'. We don't provide any way to
   * change record delimiters.
   *
   * While the input files are being processed, we write/update an index file
   * 'index.csv'  under 'output_uri_prefix' (for example,
   * gs://translation-test/index.csv) The index file is generated/updated as
   * new files are being translated. The format is:
   *
   * input_file,target_language_code,translations_file,errors_file,
   * glossary_translations_file,glossary_errors_file
   *
   * input_file is one file we matched using gcs_source.input_uri.
   * target_language_code is provided in the request.
   * translations_file contains the translations. (details provided below)
   * errors_file contains the errors during processing of the file. (details
   * below). Both translations_file and errors_file could be empty
   * strings if we have no content to output.
   * glossary_translations_file and glossary_errors_file are always empty
   * strings if the input_file is tsv. They could also be empty if we have no
   * content to output.
   *
   * Once a row is present in index.csv, the input/output matching never
   * changes. Callers should also expect all the content in input_file are
   * processed and ready to be consumed (that is, no partial output file is
   * written).
   *
   * Since index.csv will be keeping updated during the process, please make
   * sure there is no custom retention policy applied on the output bucket
   * that may avoid file updating.
   * (https://cloud.google.com/storage/docs/bucket-lock#retention-policy)
   *
   * The format of translations_file (for target language code 'trg') is:
   * `gs://translation_test/a_b_c_'trg'_translations.[extension]`
   *
   * If the input file extension is tsv, the output has the following
   * columns:
   * Column 1: ID of the request provided in the input, if it's not
   * provided in the input, then the input row number is used (0-based).
   * Column 2: source sentence.
   * Column 3: translation without applying a glossary. Empty string if there
   * is an error.
   * Column 4 (only present if a glossary is provided in the request):
   * translation after applying the glossary. Empty string if there is an
   * error applying the glossary. Could be same string as column 3 if there is
   * no glossary applied.
   *
   * If input file extension is a txt or html, the translation is directly
   * written to the output file. If glossary is requested, a separate
   * glossary_translations_file has format of
   * `gs://translation_test/a_b_c_'trg'_glossary_translations.[extension]`
   *
   * The format of errors file (for target language code 'trg') is:
   * `gs://translation_test/a_b_c_'trg'_errors.[extension]`
   *
   * If the input file extension is tsv, errors_file contains the following:
   * Column 1: ID of the request provided in the input, if it's not
   * provided in the input, then the input row number is used (0-based).
   * Column 2: source sentence.
   * Column 3: Error detail for the translation. Could be empty.
   * Column 4 (only present if a glossary is provided in the request):
   * Error when applying the glossary.
   *
   * If the input file extension is txt or html, glossary_error_file will be
   * generated that contains error details. glossary_error_file has format of
   * `gs://translation_test/a_b_c_'trg'_glossary_errors.[extension]`
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * For every single input file (for example, gs://a/b/c.[extension]), we
   * generate at most 2 * n output files. (n is the # of target_language_codes
   * in the BatchTranslateTextRequest).
   *
   * Output files (tsv) generated are compliant with RFC 4180 except that
   * record delimiters are '&#92;n' instead of '&#92;r&#92;n'. We don't provide any way to
   * change record delimiters.
   *
   * While the input files are being processed, we write/update an index file
   * 'index.csv'  under 'output_uri_prefix' (for example,
   * gs://translation-test/index.csv) The index file is generated/updated as
   * new files are being translated. The format is:
   *
   * input_file,target_language_code,translations_file,errors_file,
   * glossary_translations_file,glossary_errors_file
   *
   * input_file is one file we matched using gcs_source.input_uri.
   * target_language_code is provided in the request.
   * translations_file contains the translations. (details provided below)
   * errors_file contains the errors during processing of the file. (details
   * below). Both translations_file and errors_file could be empty
   * strings if we have no content to output.
   * glossary_translations_file and glossary_errors_file are always empty
   * strings if the input_file is tsv. They could also be empty if we have no
   * content to output.
   *
   * Once a row is present in index.csv, the input/output matching never
   * changes. Callers should also expect all the content in input_file are
   * processed and ready to be consumed (that is, no partial output file is
   * written).
   *
   * Since index.csv will be keeping updated during the process, please make
   * sure there is no custom retention policy applied on the output bucket
   * that may avoid file updating.
   * (https://cloud.google.com/storage/docs/bucket-lock#retention-policy)
   *
   * The format of translations_file (for target language code 'trg') is:
   * `gs://translation_test/a_b_c_'trg'_translations.[extension]`
   *
   * If the input file extension is tsv, the output has the following
   * columns:
   * Column 1: ID of the request provided in the input, if it's not
   * provided in the input, then the input row number is used (0-based).
   * Column 2: source sentence.
   * Column 3: translation without applying a glossary. Empty string if there
   * is an error.
   * Column 4 (only present if a glossary is provided in the request):
   * translation after applying the glossary. Empty string if there is an
   * error applying the glossary. Could be same string as column 3 if there is
   * no glossary applied.
   *
   * If input file extension is a txt or html, the translation is directly
   * written to the output file. If glossary is requested, a separate
   * glossary_translations_file has format of
   * `gs://translation_test/a_b_c_'trg'_glossary_translations.[extension]`
   *
   * The format of errors file (for target language code 'trg') is:
   * `gs://translation_test/a_b_c_'trg'_errors.[extension]`
   *
   * If the input file extension is tsv, errors_file contains the following:
   * Column 1: ID of the request provided in the input, if it's not
   * provided in the input, then the input row number is used (0-based).
   * Column 2: source sentence.
   * Column 3: Error detail for the translation. Could be empty.
   * Column 4 (only present if a glossary is provided in the request):
   * Error when applying the glossary.
   *
   * If the input file extension is txt or html, glossary_error_file will be
   * generated that contains error details. glossary_error_file has format of
   * `gs://translation_test/a_b_c_'trg'_glossary_errors.[extension]`
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.translate.v3.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * For every single input file (for example, gs://a/b/c.[extension]), we
   * generate at most 2 * n output files. (n is the # of target_language_codes
   * in the BatchTranslateTextRequest).
   *
   * Output files (tsv) generated are compliant with RFC 4180 except that
   * record delimiters are '&#92;n' instead of '&#92;r&#92;n'. We don't provide any way to
   * change record delimiters.
   *
   * While the input files are being processed, we write/update an index file
   * 'index.csv'  under 'output_uri_prefix' (for example,
   * gs://translation-test/index.csv) The index file is generated/updated as
   * new files are being translated. The format is:
   *
   * input_file,target_language_code,translations_file,errors_file,
   * glossary_translations_file,glossary_errors_file
   *
   * input_file is one file we matched using gcs_source.input_uri.
   * target_language_code is provided in the request.
   * translations_file contains the translations. (details provided below)
   * errors_file contains the errors during processing of the file. (details
   * below). Both translations_file and errors_file could be empty
   * strings if we have no content to output.
   * glossary_translations_file and glossary_errors_file are always empty
   * strings if the input_file is tsv. They could also be empty if we have no
   * content to output.
   *
   * Once a row is present in index.csv, the input/output matching never
   * changes. Callers should also expect all the content in input_file are
   * processed and ready to be consumed (that is, no partial output file is
   * written).
   *
   * Since index.csv will be keeping updated during the process, please make
   * sure there is no custom retention policy applied on the output bucket
   * that may avoid file updating.
   * (https://cloud.google.com/storage/docs/bucket-lock#retention-policy)
   *
   * The format of translations_file (for target language code 'trg') is:
   * `gs://translation_test/a_b_c_'trg'_translations.[extension]`
   *
   * If the input file extension is tsv, the output has the following
   * columns:
   * Column 1: ID of the request provided in the input, if it's not
   * provided in the input, then the input row number is used (0-based).
   * Column 2: source sentence.
   * Column 3: translation without applying a glossary. Empty string if there
   * is an error.
   * Column 4 (only present if a glossary is provided in the request):
   * translation after applying the glossary. Empty string if there is an
   * error applying the glossary. Could be same string as column 3 if there is
   * no glossary applied.
   *
   * If input file extension is a txt or html, the translation is directly
   * written to the output file. If glossary is requested, a separate
   * glossary_translations_file has format of
   * `gs://translation_test/a_b_c_'trg'_glossary_translations.[extension]`
   *
   * The format of errors file (for target language code 'trg') is:
   * `gs://translation_test/a_b_c_'trg'_errors.[extension]`
   *
   * If the input file extension is tsv, errors_file contains the following:
   * Column 1: ID of the request provided in the input, if it's not
   * provided in the input, then the input row number is used (0-based).
   * Column 2: source sentence.
   * Column 3: Error detail for the translation. Could be empty.
   * Column 4 (only present if a glossary is provided in the request):
   * Error when applying the glossary.
   *
   * If the input file extension is txt or html, glossary_error_file will be
   * generated that contains error details. glossary_error_file has format of
   * `gs://translation_test/a_b_c_'trg'_glossary_errors.[extension]`
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.translate.v3.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  com.google.cloud.translate.v3.OutputConfig.DestinationCase getDestinationCase();
}
