/**
 */
package com.github.lbroudoux.dsl.eip.provider;


import com.github.lbroudoux.dsl.eip.Aggregator;
import com.github.lbroudoux.dsl.eip.EipPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.lbroudoux.dsl.eip.Aggregator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregatorItemProvider 
	extends MetadatableItemProvider {
	/**
    * This constructs an instance from a factory and a notifier.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public AggregatorItemProvider(AdapterFactory adapterFactory) {
      super(adapterFactory);
   }

	/**
    * This returns the property descriptors for the adapted class.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
      if (itemPropertyDescriptors == null) {
         super.getPropertyDescriptors(object);

         addNamePropertyDescriptor(object);
         addToChannelsPropertyDescriptor(object);
         addFromChannelsPropertyDescriptor(object);
         addPartPropertyDescriptor(object);
         addStrategyPropertyDescriptor(object);
         addExpressionPropertyDescriptor(object);
      }
      return itemPropertyDescriptors;
   }

	/**
    * This adds a property descriptor for the Name feature.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected void addNamePropertyDescriptor(Object object) {
      itemPropertyDescriptors.add
         (createItemPropertyDescriptor
            (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
             getResourceLocator(),
             getString("_UI_Endpoint_name_feature"),
             getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_name_feature", "_UI_Endpoint_type"),
             EipPackage.Literals.ENDPOINT__NAME,
             true,
             false,
             false,
             ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
             null,
             null));
   }

	/**
    * This adds a property descriptor for the To Channels feature.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void addToChannelsPropertyDescriptor(Object object) {
      itemPropertyDescriptors.add
         (createItemPropertyDescriptor
            (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
             getResourceLocator(),
             getString("_UI_Endpoint_toChannels_feature"),
             getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_toChannels_feature", "_UI_Endpoint_type"),
             EipPackage.Literals.ENDPOINT__TO_CHANNELS,
             true,
             false,
             true,
             null,
             null,
             null));
   }

   /**
    * This adds a property descriptor for the From Channels feature.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected void addFromChannelsPropertyDescriptor(Object object) {
      itemPropertyDescriptors.add
         (createItemPropertyDescriptor
            (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
             getResourceLocator(),
             getString("_UI_Endpoint_fromChannels_feature"),
             getString("_UI_PropertyDescriptor_description", "_UI_Endpoint_fromChannels_feature", "_UI_Endpoint_type"),
             EipPackage.Literals.ENDPOINT__FROM_CHANNELS,
             true,
             false,
             true,
             null,
             null,
             null));
   }

	/**
    * This adds a property descriptor for the Part feature.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void addPartPropertyDescriptor(Object object) {
      itemPropertyDescriptors.add
         (createItemPropertyDescriptor
            (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
             getResourceLocator(),
             getString("_UI_Aggregator_part_feature"),
             getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_part_feature", "_UI_Aggregator_type"),
             EipPackage.Literals.AGGREGATOR__PART,
             true,
             false,
             false,
             ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
             null,
             null));
   }

   /**
    * This adds a property descriptor for the Strategy feature.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected void addStrategyPropertyDescriptor(Object object) {
      itemPropertyDescriptors.add
         (createItemPropertyDescriptor
            (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
             getResourceLocator(),
             getString("_UI_Aggregator_strategy_feature"),
             getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_strategy_feature", "_UI_Aggregator_type"),
             EipPackage.Literals.AGGREGATOR__STRATEGY,
             true,
             false,
             false,
             ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
             null,
             null));
   }

	/**
    * This adds a property descriptor for the Expression feature.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected void addExpressionPropertyDescriptor(Object object) {
      itemPropertyDescriptors.add
         (createItemPropertyDescriptor
            (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
             getResourceLocator(),
             getString("_UI_Aggregator_expression_feature"),
             getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_expression_feature", "_UI_Aggregator_type"),
             EipPackage.Literals.AGGREGATOR__EXPRESSION,
             true,
             false,
             false,
             ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
             null,
             null));
   }

   /**
    * This returns Aggregator.gif.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public Object getImage(Object object) {
      return overlayImage(object, getResourceLocator().getImage("full/obj16/Aggregator"));
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected boolean shouldComposeCreationImage() {
      return true;
   }

   /**
    * This returns the label text for the adapted class.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public String getText(Object object) {
      String label = ((Aggregator)object).getName();
      return label == null || label.length() == 0 ?
         getString("_UI_Aggregator_type") :
         getString("_UI_Aggregator_type") + " " + label;
   }
	

	/**
    * This handles model notifications by calling {@link #updateChildren} to update any cached
    * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public void notifyChanged(Notification notification) {
      updateChildren(notification);

      switch (notification.getFeatureID(Aggregator.class)) {
         case EipPackage.AGGREGATOR__NAME:
         case EipPackage.AGGREGATOR__PART:
         case EipPackage.AGGREGATOR__STRATEGY:
         case EipPackage.AGGREGATOR__EXPRESSION:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
      }
      super.notifyChanged(notification);
   }

	/**
    * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
    * that can be created under this object.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
      super.collectNewChildDescriptors(newChildDescriptors, object);
   }

}
