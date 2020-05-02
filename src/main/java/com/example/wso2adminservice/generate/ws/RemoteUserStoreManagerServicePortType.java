
package com.example.wso2adminservice.generate.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RemoteUserStoreManagerServicePortType", targetNamespace = "http://service.ws.um.carbon.wso2.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RemoteUserStoreManagerServicePortType {


    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:deleteUserClaimValues")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void deleteUserClaimValues(
        @WebParam(name = "deleteUserClaimValues", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        DeleteUserClaimValues parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getRoleNames")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getRoleNames", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetRoleNames")
    @ResponseWrapper(localName = "getRoleNamesResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetRoleNamesResponse")
    public List<String> getRoleNames()
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:updateCredential")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void updateCredential(
        @WebParam(name = "updateCredential", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        UpdateCredential parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param credential
     * @param userName
     * @return
     *     returns java.lang.Boolean
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:authenticate")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.AuthenticateResponse")
    public Boolean authenticate(
        @WebParam(name = "userName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String userName,
        @WebParam(name = "credential", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String credential)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:addUserClaimValues")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void addUserClaimValues(
        @WebParam(name = "addUserClaimValues", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        AddUserClaimValues parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param userName
     * @return
     *     returns java.lang.Boolean
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:isExistingUser")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "isExistingUser", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.IsExistingUser")
    @ResponseWrapper(localName = "isExistingUserResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.IsExistingUserResponse")
    public Boolean isExistingUser(
        @WebParam(name = "userName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String userName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:addUser")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void addUser(
        @WebParam(name = "addUser", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        AddUser parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:updateRoleListOfUser")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void updateRoleListOfUser(
        @WebParam(name = "updateRoleListOfUser", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        UpdateRoleListOfUser parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getAllProfileNames")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getAllProfileNames", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetAllProfileNames")
    @ResponseWrapper(localName = "getAllProfileNamesResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetAllProfileNamesResponse")
    public List<String> getAllProfileNames()
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param userName
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getRoleListOfUser")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getRoleListOfUser", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetRoleListOfUser")
    @ResponseWrapper(localName = "getRoleListOfUserResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetRoleListOfUserResponse")
    public List<String> getRoleListOfUser(
        @WebParam(name = "userName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String userName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param claimUri
     * @param profile
     * @param claimValue
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getUserList")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getUserList", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserList")
    @ResponseWrapper(localName = "getUserListResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserListResponse")
    public List<String> getUserList(
        @WebParam(name = "claimUri", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String claimUri,
        @WebParam(name = "claimValue", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String claimValue,
        @WebParam(name = "profile", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String profile)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:setUserClaimValues")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void setUserClaimValues(
        @WebParam(name = "setUserClaimValues", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        SetUserClaimValues parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:deleteUserClaimValue")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void deleteUserClaimValue(
        @WebParam(name = "deleteUserClaimValue", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        DeleteUserClaimValue parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.Boolean
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:isReadOnly")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "isReadOnly", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.IsReadOnly")
    @ResponseWrapper(localName = "isReadOnlyResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.IsReadOnlyResponse")
    public Boolean isReadOnly()
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getHybridRoles")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getHybridRoles", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetHybridRoles")
    @ResponseWrapper(localName = "getHybridRolesResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetHybridRolesResponse")
    public List<String> getHybridRoles()
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param profileName
     * @param claims
     * @param userName
     * @return
     *     returns java.util.List<com.example.wso2adminservice.generate.ws.ClaimValue>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getUserClaimValuesForClaims")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getUserClaimValuesForClaims", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserClaimValuesForClaims")
    @ResponseWrapper(localName = "getUserClaimValuesForClaimsResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserClaimValuesForClaimsResponse")
    public List<ClaimValue> getUserClaimValuesForClaims(
        @WebParam(name = "userName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String userName,
        @WebParam(name = "claims", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        List<String> claims,
        @WebParam(name = "profileName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String profileName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Long
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getPasswordExpirationTime")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getPasswordExpirationTime", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetPasswordExpirationTime")
    @ResponseWrapper(localName = "getPasswordExpirationTimeResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetPasswordExpirationTimeResponse")
    public Long getPasswordExpirationTime(
        @WebParam(name = "username", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String username)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:updateUserListOfRole")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void updateUserListOfRole(
        @WebParam(name = "updateUserListOfRole", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        UpdateUserListOfRole parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param tenant
     * @return
     *     returns java.util.List<com.example.wso2adminservice.generate.ws.ArrayOfString>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getProperties")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getProperties", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetProperties")
    @ResponseWrapper(localName = "getPropertiesResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetPropertiesResponse")
    public List<ArrayOfString> getProperties(
        @WebParam(name = "tenant", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        Tenant2 tenant)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param roleName
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getUserListOfRole")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getUserListOfRole", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserListOfRole")
    @ResponseWrapper(localName = "getUserListOfRoleResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserListOfRoleResponse")
    public List<String> getUserListOfRole(
        @WebParam(name = "roleName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String roleName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.Integer
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getTenantId")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getTenantId", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetTenantId")
    @ResponseWrapper(localName = "getTenantIdResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetTenantIdResponse")
    public Integer getTenantId()
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:deleteRole")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void deleteRole(
        @WebParam(name = "deleteRole", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        DeleteRole parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param roleName
     * @return
     *     returns java.lang.Boolean
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:isExistingRole")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "isExistingRole", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.IsExistingRole")
    @ResponseWrapper(localName = "isExistingRoleResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.IsExistingRoleResponse")
    public Boolean isExistingRole(
        @WebParam(name = "roleName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String roleName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:updateCredentialByAdmin")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void updateCredentialByAdmin(
        @WebParam(name = "updateCredentialByAdmin", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        UpdateCredentialByAdmin parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param profileName
     * @param userName
     * @return
     *     returns java.util.List<com.example.wso2adminservice.generate.ws.ClaimDTO>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getUserClaimValues")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getUserClaimValues", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserClaimValues")
    @ResponseWrapper(localName = "getUserClaimValuesResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserClaimValuesResponse")
    public List<ClaimDTO> getUserClaimValues(
        @WebParam(name = "userName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String userName,
        @WebParam(name = "profileName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String profileName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:setUserClaimValue")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void setUserClaimValue(
        @WebParam(name = "setUserClaimValue", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        SetUserClaimValue parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Integer
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getTenantIdofUser")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getTenantIdofUser", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetTenantIdofUser")
    @ResponseWrapper(localName = "getTenantIdofUserResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetTenantIdofUserResponse")
    public Integer getTenantIdofUser(
        @WebParam(name = "username", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String username)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param profileName
     * @param claim
     * @param userName
     * @return
     *     returns java.lang.String
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getUserClaimValue")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getUserClaimValue", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserClaimValue")
    @ResponseWrapper(localName = "getUserClaimValueResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserClaimValueResponse")
    public String getUserClaimValue(
        @WebParam(name = "userName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String userName,
        @WebParam(name = "claim", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String claim,
        @WebParam(name = "profileName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String profileName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param filter
     * @param maxItemLimit
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:listUsers")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "listUsers", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.ListUsers")
    @ResponseWrapper(localName = "listUsersResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.ListUsersResponse")
    public List<String> listUsers(
        @WebParam(name = "filter", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String filter,
        @WebParam(name = "maxItemLimit", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        Integer maxItemLimit)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:deleteUser")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void deleteUser(
        @WebParam(name = "deleteUser", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        DeleteUser parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param userName
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getProfileNames")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getProfileNames", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetProfileNames")
    @ResponseWrapper(localName = "getProfileNamesResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetProfileNamesResponse")
    public List<String> getProfileNames(
        @WebParam(name = "userName", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String userName)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:addUserClaimValue")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void addUserClaimValue(
        @WebParam(name = "addUserClaimValue", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        AddUserClaimValue parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:updateRoleName")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void updateRoleName(
        @WebParam(name = "updateRoleName", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        UpdateRoleName parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param parameters
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:addRole")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void addRole(
        @WebParam(name = "addRole", targetNamespace = "http://service.ws.um.carbon.wso2.org", partName = "parameters")
        AddRole parameters)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Integer
     * @throws RemoteUserStoreManagerServiceUserStoreException_Exception
     */
    @WebMethod(action = "urn:getUserId")
    @WebResult(targetNamespace = "http://service.ws.um.carbon.wso2.org")
    @RequestWrapper(localName = "getUserId", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserId")
    @ResponseWrapper(localName = "getUserIdResponse", targetNamespace = "http://service.ws.um.carbon.wso2.org", className = "com.example.wso2adminservice.generate.ws.GetUserIdResponse")
    public Integer getUserId(
        @WebParam(name = "username", targetNamespace = "http://service.ws.um.carbon.wso2.org")
        String username)
        throws RemoteUserStoreManagerServiceUserStoreException_Exception
    ;

}