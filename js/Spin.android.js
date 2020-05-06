import React, {
  PureComponent,
} from 'react'

import {
  requireNativeComponent,
} from 'react-native'

import PropTypes from 'prop-types'

class Spin extends PureComponent {

  static propTypes = {
    size: PropTypes.string.isRequired,
    color: PropTypes.string.isRequired,
  }

  static defaultProps = {
    size: 'small',
    color: '#999',
  }

  render() {

    let {
      size,
      color,
    } = this.props

    return (
      <RNTSpin
        size={size === 'small' ? 10 : 20}
        color={color}
      />
    )

  }

}

const RNTSpin = requireNativeComponent('RNTSpin', Spin)

export default Spin
