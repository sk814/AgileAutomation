/**
 * generated by Xtext 2.23.0
 */
package co7217.xtext.entity.entityDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.xtext.entity.entityDSL.DataType#getName <em>Name</em>}</li>
 *   <li>{@link co7217.xtext.entity.entityDSL.DataType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link co7217.xtext.entity.entityDSL.DataType#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see co7217.xtext.entity.entityDSL.EntityDSLPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Type
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co7217.xtext.entity.entityDSL.EntityDSLPackage#getDataType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co7217.xtext.entity.entityDSL.DataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Literal)
   * @see co7217.xtext.entity.entityDSL.EntityDSLPackage#getDataType_SuperType()
   * @model
   * @generated
   */
  Literal getSuperType();

  /**
   * Sets the value of the '{@link co7217.xtext.entity.entityDSL.DataType#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Literal value);

  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link co7217.xtext.entity.entityDSL.Literal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see co7217.xtext.entity.entityDSL.EntityDSLPackage#getDataType_Literals()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getLiterals();

} // DataType
