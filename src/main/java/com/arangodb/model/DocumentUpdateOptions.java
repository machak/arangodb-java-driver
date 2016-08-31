package com.arangodb.model;

/**
 * @author Mark - mark at arangodb.com
 * 
 * @see <a href="https://docs.arangodb.com/current/HTTP/Document/WorkingWithDocuments.html#update-document">API
 *      Documentation</a>
 */
public class DocumentUpdateOptions {

	private Boolean keepNull;
	private Boolean mergeObjects;
	private Boolean waitForSync;
	private Boolean ignoreRevs;
	private String ifMatch;
	private Boolean returnNew;
	private Boolean returnOld;

	public DocumentUpdateOptions() {
		super();
	}

	public Boolean getKeepNull() {
		return keepNull;
	}

	/**
	 * @param keepNull
	 *            If the intention is to delete existing attributes with the patch command, the URL query parameter
	 *            keepNull can be used with a value of false. This will modify the behavior of the patch command to
	 *            remove any attributes from the existing document that are contained in the patch document with an
	 *            attribute value of null.
	 * @return options
	 */
	public DocumentUpdateOptions keepNull(final Boolean keepNull) {
		this.keepNull = keepNull;
		return this;
	}

	public Boolean getMergeObjects() {
		return mergeObjects;
	}

	/**
	 * @param mergeObjects
	 *            Controls whether objects (not arrays) will be merged if present in both the existing and the patch
	 *            document. If set to false, the value in the patch document will overwrite the existing document's
	 *            value. If set to true, objects will be merged. The default is true.
	 * @return options
	 */
	public DocumentUpdateOptions mergeObjects(final Boolean mergeObjects) {
		this.mergeObjects = mergeObjects;
		return this;
	}

	public Boolean getWaitForSync() {
		return waitForSync;
	}

	/**
	 * @param waitForSync
	 *            Wait until document has been synced to disk.
	 * @return options
	 */
	public DocumentUpdateOptions waitForSync(final Boolean waitForSync) {
		this.waitForSync = waitForSync;
		return this;
	}

	public Boolean getIgnoreRevs() {
		return ignoreRevs;
	}

	/**
	 * @param ignoreRevs
	 *            By default, or if this is set to true, the _rev attributes in the given document is ignored. If this
	 *            is set to false, then the _rev attribute given in the body document is taken as a precondition. The
	 *            document is only updated if the current revision is the one specified.
	 * @return options
	 */
	public DocumentUpdateOptions ignoreRevs(final Boolean ignoreRevs) {
		this.ignoreRevs = ignoreRevs;
		return this;
	}

	public String getIfMatch() {
		return ifMatch;
	}

	/**
	 * @param ifMatch
	 *            update a document based on target revision
	 * @return options
	 */
	public DocumentUpdateOptions ifMatch(final String ifMatch) {
		this.ifMatch = ifMatch;
		return this;
	}

	public Boolean getReturnNew() {
		return returnNew;
	}

	/**
	 * @param returnNew
	 *            Return additionally the complete new document under the attribute new in the result.
	 * @return options
	 */
	public DocumentUpdateOptions returnNew(final Boolean returnNew) {
		this.returnNew = returnNew;
		return this;
	}

	public Boolean getReturnOld() {
		return returnOld;
	}

	/**
	 * @param returnOld
	 *            Return additionally the complete previous revision of the changed document under the attribute old in
	 *            the result.
	 * @return options
	 */
	public DocumentUpdateOptions returnOld(final Boolean returnOld) {
		this.returnOld = returnOld;
		return this;
	}

}