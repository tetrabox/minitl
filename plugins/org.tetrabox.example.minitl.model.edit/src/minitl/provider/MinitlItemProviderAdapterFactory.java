/**
 */
package minitl.provider;

import java.util.ArrayList;
import java.util.Collection;

import minitl.util.MinitlAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MinitlItemProviderAdapterFactory extends MinitlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinitlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.Transformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationItemProvider transformationItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.Transformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransformationAdapter() {
		if (transformationItemProvider == null) {
			transformationItemProvider = new TransformationItemProvider(this);
		}

		return transformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.Binding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingItemProvider bindingItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingAdapter() {
		if (bindingItemProvider == null) {
			bindingItemProvider = new BindingItemProvider(this);
		}

		return bindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.BinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionItemProvider binaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.BinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryExpressionAdapter() {
		if (binaryExpressionItemProvider == null) {
			binaryExpressionItemProvider = new BinaryExpressionItemProvider(this);
		}

		return binaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.FieldAccessValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccessValueItemProvider fieldAccessValueItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.FieldAccessValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldAccessValueAdapter() {
		if (fieldAccessValueItemProvider == null) {
			fieldAccessValueItemProvider = new FieldAccessValueItemProvider(this);
		}

		return fieldAccessValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.ObjectTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTemplateItemProvider objectTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.ObjectTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectTemplateAdapter() {
		if (objectTemplateItemProvider == null) {
			objectTemplateItemProvider = new ObjectTemplateItemProvider(this);
		}

		return objectTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.StringValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringValueItemProvider stringValueItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.StringValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringValueAdapter() {
		if (stringValueItemProvider == null) {
			stringValueItemProvider = new StringValueItemProvider(this);
		}

		return stringValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.ObjectTemplateValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTemplateValueItemProvider objectTemplateValueItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.ObjectTemplateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectTemplateValueAdapter() {
		if (objectTemplateValueItemProvider == null) {
			objectTemplateValueItemProvider = new ObjectTemplateValueItemProvider(this);
		}

		return objectTemplateValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link minitl.Metamodel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelItemProvider metamodelItemProvider;

	/**
	 * This creates an adapter for a {@link minitl.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetamodelAdapter() {
		if (metamodelItemProvider == null) {
			metamodelItemProvider = new MetamodelItemProvider(this);
		}

		return metamodelItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (transformationItemProvider != null) transformationItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (bindingItemProvider != null) bindingItemProvider.dispose();
		if (binaryExpressionItemProvider != null) binaryExpressionItemProvider.dispose();
		if (fieldAccessValueItemProvider != null) fieldAccessValueItemProvider.dispose();
		if (objectTemplateItemProvider != null) objectTemplateItemProvider.dispose();
		if (stringValueItemProvider != null) stringValueItemProvider.dispose();
		if (objectTemplateValueItemProvider != null) objectTemplateValueItemProvider.dispose();
		if (metamodelItemProvider != null) metamodelItemProvider.dispose();
	}

}
