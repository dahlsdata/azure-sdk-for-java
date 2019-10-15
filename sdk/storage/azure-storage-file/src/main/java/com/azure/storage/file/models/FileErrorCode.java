// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for FileErrorCode.
 */
public final class FileErrorCode extends ExpandableStringEnum<FileErrorCode> {
    /**
     * Static value AccountAlreadyExists for FileErrorCode.
     */
    public static final FileErrorCode ACCOUNT_ALREADY_EXISTS = fromString("AccountAlreadyExists");

    /**
     * Static value AccountBeingCreated for FileErrorCode.
     */
    public static final FileErrorCode ACCOUNT_BEING_CREATED = fromString("AccountBeingCreated");

    /**
     * Static value AccountIsDisabled for FileErrorCode.
     */
    public static final FileErrorCode ACCOUNT_IS_DISABLED = fromString("AccountIsDisabled");

    /**
     * Static value AuthenticationFailed for FileErrorCode.
     */
    public static final FileErrorCode AUTHENTICATION_FAILED = fromString("AuthenticationFailed");

    /**
     * Static value AuthorizationFailure for FileErrorCode.
     */
    public static final FileErrorCode AUTHORIZATION_FAILURE = fromString("AuthorizationFailure");

    /**
     * Static value ConditionHeadersNotSupported for FileErrorCode.
     */
    public static final FileErrorCode CONDITION_HEADERS_NOT_SUPPORTED = fromString("ConditionHeadersNotSupported");

    /**
     * Static value ConditionNotMet for FileErrorCode.
     */
    public static final FileErrorCode CONDITION_NOT_MET = fromString("ConditionNotMet");

    /**
     * Static value EmptyMetadataKey for FileErrorCode.
     */
    public static final FileErrorCode EMPTY_METADATA_KEY = fromString("EmptyMetadataKey");

    /**
     * Static value InsufficientAccountPermissions for FileErrorCode.
     */
    public static final FileErrorCode INSUFFICIENT_ACCOUNT_PERMISSIONS = fromString("InsufficientAccountPermissions");

    /**
     * Static value InternalError for FileErrorCode.
     */
    public static final FileErrorCode INTERNAL_ERROR = fromString("InternalError");

    /**
     * Static value InvalidAuthenticationInfo for FileErrorCode.
     */
    public static final FileErrorCode INVALID_AUTHENTICATION_INFO = fromString("InvalidAuthenticationInfo");

    /**
     * Static value InvalidHeaderValue for FileErrorCode.
     */
    public static final FileErrorCode INVALID_HEADER_VALUE = fromString("InvalidHeaderValue");

    /**
     * Static value InvalidHttpVerb for FileErrorCode.
     */
    public static final FileErrorCode INVALID_HTTP_VERB = fromString("InvalidHttpVerb");

    /**
     * Static value InvalidInput for FileErrorCode.
     */
    public static final FileErrorCode INVALID_INPUT = fromString("InvalidInput");

    /**
     * Static value InvalidMd5 for FileErrorCode.
     */
    public static final FileErrorCode INVALID_MD5 = fromString("InvalidMd5");

    /**
     * Static value InvalidMetadata for FileErrorCode.
     */
    public static final FileErrorCode INVALID_METADATA = fromString("InvalidMetadata");

    /**
     * Static value InvalidQueryParameterValue for FileErrorCode.
     */
    public static final FileErrorCode INVALID_QUERY_PARAMETER_VALUE = fromString("InvalidQueryParameterValue");

    /**
     * Static value InvalidRange for FileErrorCode.
     */
    public static final FileErrorCode INVALID_RANGE = fromString("InvalidRange");

    /**
     * Static value InvalidResourceName for FileErrorCode.
     */
    public static final FileErrorCode INVALID_RESOURCE_NAME = fromString("InvalidResourceName");

    /**
     * Static value InvalidUri for FileErrorCode.
     */
    public static final FileErrorCode INVALID_URI = fromString("InvalidUri");

    /**
     * Static value InvalidXmlDocument for FileErrorCode.
     */
    public static final FileErrorCode INVALID_XML_DOCUMENT = fromString("InvalidXmlDocument");

    /**
     * Static value InvalidXmlNodeValue for FileErrorCode.
     */
    public static final FileErrorCode INVALID_XML_NODE_VALUE = fromString("InvalidXmlNodeValue");

    /**
     * Static value Md5Mismatch for FileErrorCode.
     */
    public static final FileErrorCode MD5MISMATCH = fromString("Md5Mismatch");

    /**
     * Static value MetadataTooLarge for FileErrorCode.
     */
    public static final FileErrorCode METADATA_TOO_LARGE = fromString("MetadataTooLarge");

    /**
     * Static value MissingContentLengthHeader for FileErrorCode.
     */
    public static final FileErrorCode MISSING_CONTENT_LENGTH_HEADER = fromString("MissingContentLengthHeader");

    /**
     * Static value MissingRequiredQueryParameter for FileErrorCode.
     */
    public static final FileErrorCode MISSING_REQUIRED_QUERY_PARAMETER = fromString("MissingRequiredQueryParameter");

    /**
     * Static value MissingRequiredHeader for FileErrorCode.
     */
    public static final FileErrorCode MISSING_REQUIRED_HEADER = fromString("MissingRequiredHeader");

    /**
     * Static value MissingRequiredXmlNode for FileErrorCode.
     */
    public static final FileErrorCode MISSING_REQUIRED_XML_NODE = fromString("MissingRequiredXmlNode");

    /**
     * Static value MultipleConditionHeadersNotSupported for FileErrorCode.
     */
    public static final FileErrorCode MULTIPLE_CONDITION_HEADERS_NOT_SUPPORTED = fromString("MultipleConditionHeadersNotSupported");

    /**
     * Static value OperationTimedOut for FileErrorCode.
     */
    public static final FileErrorCode OPERATION_TIMED_OUT = fromString("OperationTimedOut");

    /**
     * Static value OutOfRangeInput for FileErrorCode.
     */
    public static final FileErrorCode OUT_OF_RANGE_INPUT = fromString("OutOfRangeInput");

    /**
     * Static value OutOfRangeQueryParameterValue for FileErrorCode.
     */
    public static final FileErrorCode OUT_OF_RANGE_QUERY_PARAMETER_VALUE = fromString("OutOfRangeQueryParameterValue");

    /**
     * Static value RequestBodyTooLarge for FileErrorCode.
     */
    public static final FileErrorCode REQUEST_BODY_TOO_LARGE = fromString("RequestBodyTooLarge");

    /**
     * Static value ResourceTypeMismatch for FileErrorCode.
     */
    public static final FileErrorCode RESOURCE_TYPE_MISMATCH = fromString("ResourceTypeMismatch");

    /**
     * Static value RequestUrlFailedToParse for FileErrorCode.
     */
    public static final FileErrorCode REQUEST_URL_FAILED_TO_PARSE = fromString("RequestUrlFailedToParse");

    /**
     * Static value ResourceAlreadyExists for FileErrorCode.
     */
    public static final FileErrorCode RESOURCE_ALREADY_EXISTS = fromString("ResourceAlreadyExists");

    /**
     * Static value ResourceNotFound for FileErrorCode.
     */
    public static final FileErrorCode RESOURCE_NOT_FOUND = fromString("ResourceNotFound");

    /**
     * Static value ServerBusy for FileErrorCode.
     */
    public static final FileErrorCode SERVER_BUSY = fromString("ServerBusy");

    /**
     * Static value UnsupportedHeader for FileErrorCode.
     */
    public static final FileErrorCode UNSUPPORTED_HEADER = fromString("UnsupportedHeader");

    /**
     * Static value UnsupportedXmlNode for FileErrorCode.
     */
    public static final FileErrorCode UNSUPPORTED_XML_NODE = fromString("UnsupportedXmlNode");

    /**
     * Static value UnsupportedQueryParameter for FileErrorCode.
     */
    public static final FileErrorCode UNSUPPORTED_QUERY_PARAMETER = fromString("UnsupportedQueryParameter");

    /**
     * Static value UnsupportedHttpVerb for FileErrorCode.
     */
    public static final FileErrorCode UNSUPPORTED_HTTP_VERB = fromString("UnsupportedHttpVerb");

    /**
     * Static value CannotDeleteFileOrDirectory for FileErrorCode.
     */
    public static final FileErrorCode CANNOT_DELETE_FILE_OR_DIRECTORY = fromString("CannotDeleteFileOrDirectory");

    /**
     * Static value ClientCacheFlushDelay for FileErrorCode.
     */
    public static final FileErrorCode CLIENT_CACHE_FLUSH_DELAY = fromString("ClientCacheFlushDelay");

    /**
     * Static value DeletePending for FileErrorCode.
     */
    public static final FileErrorCode DELETE_PENDING = fromString("DeletePending");

    /**
     * Static value DirectoryNotEmpty for FileErrorCode.
     */
    public static final FileErrorCode DIRECTORY_NOT_EMPTY = fromString("DirectoryNotEmpty");

    /**
     * Static value FileLockConflict for FileErrorCode.
     */
    public static final FileErrorCode FILE_LOCK_CONFLICT = fromString("FileLockConflict");

    /**
     * Static value InvalidFileOrDirectoryPathName for FileErrorCode.
     */
    public static final FileErrorCode INVALID_FILE_OR_DIRECTORY_PATH_NAME = fromString("InvalidFileOrDirectoryPathName");

    /**
     * Static value ParentNotFound for FileErrorCode.
     */
    public static final FileErrorCode PARENT_NOT_FOUND = fromString("ParentNotFound");

    /**
     * Static value ReadOnlyAttribute for FileErrorCode.
     */
    public static final FileErrorCode READ_ONLY_ATTRIBUTE = fromString("ReadOnlyAttribute");

    /**
     * Static value ShareAlreadyExists for FileErrorCode.
     */
    public static final FileErrorCode SHARE_ALREADY_EXISTS = fromString("ShareAlreadyExists");

    /**
     * Static value ShareBeingDeleted for FileErrorCode.
     */
    public static final FileErrorCode SHARE_BEING_DELETED = fromString("ShareBeingDeleted");

    /**
     * Static value ShareDisabled for FileErrorCode.
     */
    public static final FileErrorCode SHARE_DISABLED = fromString("ShareDisabled");

    /**
     * Static value ShareNotFound for FileErrorCode.
     */
    public static final FileErrorCode SHARE_NOT_FOUND = fromString("ShareNotFound");

    /**
     * Static value SharingViolation for FileErrorCode.
     */
    public static final FileErrorCode SHARING_VIOLATION = fromString("SharingViolation");

    /**
     * Static value ShareSnapshotInProgress for FileErrorCode.
     */
    public static final FileErrorCode SHARE_SNAPSHOT_IN_PROGRESS = fromString("ShareSnapshotInProgress");

    /**
     * Static value ShareSnapshotCountExceeded for FileErrorCode.
     */
    public static final FileErrorCode SHARE_SNAPSHOT_COUNT_EXCEEDED = fromString("ShareSnapshotCountExceeded");

    /**
     * Static value ShareSnapshotOperationNotSupported for FileErrorCode.
     */
    public static final FileErrorCode SHARE_SNAPSHOT_OPERATION_NOT_SUPPORTED = fromString("ShareSnapshotOperationNotSupported");

    /**
     * Static value ShareHasSnapshots for FileErrorCode.
     */
    public static final FileErrorCode SHARE_HAS_SNAPSHOTS = fromString("ShareHasSnapshots");

    /**
     * Static value ContainerQuotaDowngradeNotAllowed for FileErrorCode.
     */
    public static final FileErrorCode CONTAINER_QUOTA_DOWNGRADE_NOT_ALLOWED = fromString("ContainerQuotaDowngradeNotAllowed");

    /**
     * Static value AuthorizationSourceIPMismatch for FileErrorCode.
     */
    public static final FileErrorCode AUTHORIZATION_SOURCE_IPMISMATCH = fromString("AuthorizationSourceIPMismatch");

    /**
     * Static value AuthorizationProtocolMismatch for FileErrorCode.
     */
    public static final FileErrorCode AUTHORIZATION_PROTOCOL_MISMATCH = fromString("AuthorizationProtocolMismatch");

    /**
     * Static value AuthorizationPermissionMismatch for FileErrorCode.
     */
    public static final FileErrorCode AUTHORIZATION_PERMISSION_MISMATCH = fromString("AuthorizationPermissionMismatch");

    /**
     * Static value AuthorizationServiceMismatch for FileErrorCode.
     */
    public static final FileErrorCode AUTHORIZATION_SERVICE_MISMATCH = fromString("AuthorizationServiceMismatch");

    /**
     * Static value AuthorizationResourceTypeMismatch for FileErrorCode.
     */
    public static final FileErrorCode AUTHORIZATION_RESOURCE_TYPE_MISMATCH = fromString("AuthorizationResourceTypeMismatch");

    /**
     * Static value FeatureVersionMismatch for FileErrorCode.
     */
    public static final FileErrorCode FEATURE_VERSION_MISMATCH = fromString("FeatureVersionMismatch");

    /**
     * Creates or finds a FileErrorCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileErrorCode.
     */
    @JsonCreator
    public static FileErrorCode fromString(String name) {
        return fromString(name, FileErrorCode.class);
    }

    /**
     * @return known FileErrorCode values.
     */
    public static Collection<FileErrorCode> values() {
        return values(FileErrorCode.class);
    }
}
